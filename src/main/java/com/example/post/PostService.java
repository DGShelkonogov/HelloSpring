package com.example.post;

import com.example.location.Location;
import com.example.user.User;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class PostService {

    User u1 = new User(
            "u1",
            "u1",
            "u1",
            "sadf",
            new Location("l1", "Lago"));

    User u2 = new User(
            "u2",
            "u2",
            "u2",
            "saasdfdf",
            new Location("l2", "Laefsdfo"));


    Post p1 = new Post(
            "p1",
            "date",
            "Its",  u1);
    Post p2 = new Post(
            "p2",
            "date2",
            "Its2",  u2);

    List<Post> posts = Arrays.asList(p1,p2);

    public List<Post> getAllPost(){return posts;}

    public Post getPost(String id){
        return posts.stream().
                filter(t -> id.equals(t.getId()))
                .findFirst()
                .orElse(null);
    }
    public void addPost(Post post){
        posts.add(post);
    }

    public void updatePost(String id,Post post) {
        for(int i = 0; i <posts.size(); i++){
            if(posts.get(i).getId().equals(id)){
                posts.set(i, post);
            }
        }
    }

    public void deletePost(String id){
        posts.removeIf(l -> l.getId().equals(id));
    }


}
