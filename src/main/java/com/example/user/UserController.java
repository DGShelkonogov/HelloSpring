package com.example.user;

import com.example.location.Location;
import com.example.post.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/users")
    public List<User> getAllUsers(){
        return userService.getAllUser();
    }

    @RequestMapping(value = "/users/{Id}")
    public User getUser(@PathVariable String Id){
        return userService.getUser(Id);
    }

    @RequestMapping(value = "/users", method = RequestMethod.POST)
    public void addUser(@RequestBody User user){
        userService.addUser(user);
    }

    @RequestMapping(value = "/users/{Id}", method = RequestMethod.PUT)
    public void updateUser(@RequestBody User user, @PathVariable ("Id")  String id){
        userService.updateUser(id, user);
    }

    @RequestMapping(value = "/users/{Id}", method = RequestMethod.DELETE)
    public void deleteUser(@PathVariable ("Id") String id){
        userService.deleteUser(id);
    }
}
