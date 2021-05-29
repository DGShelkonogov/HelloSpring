package com.example.post;

import com.example.location.Location;
import com.example.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;


@RestController
public class PostController {

    @Autowired
    private PostService postService;

    @RequestMapping(value = "/posts")
    public List<Post> getAllPost(){return postService.getAllPost();}

    @RequestMapping(value = "/posts/{Id}")
    public Post getPost(@PathVariable String Id){
        return postService.getPost(Id);
    }

    @RequestMapping(value = "/posts", method = RequestMethod.POST)
    public void addPost(@RequestBody Post post){
        postService.addPost(post);
    }

    @RequestMapping(value = "/posts/{Id}", method = RequestMethod.PUT)
    public void updatePost(@RequestBody Post post, @PathVariable ("Id")  String id){
        postService.updatePost(id, post);
    }

    @RequestMapping(value = "/posts/{Id}", method = RequestMethod.DELETE)
    public void deletePost(@PathVariable ("Id") String id){
        postService.deletePost(id);
    }

}
