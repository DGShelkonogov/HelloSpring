package com.example.user;

import com.example.location.Location;
import com.example.post.Post;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class UserService {

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

    List<User> users = Arrays.asList(u1, u2);

    public List<User> getAllUser(){return users;}

    public User getUser(String id){
        return users.stream().
                filter(t -> id.equals(t.getId()))
                .findFirst()
                .orElse(null);
    }


    public void addUser(User user){
        users.add(user);
    }


    public void updateUser(String id,User user) {
        for(int i = 0; i <users.size(); i++){
            if(users.get(i).getId().equals(id)){
                users.set(i, user);
            }
        }
    }
    public void deleteUser(String id){
        users.removeIf(l -> l.getId().equals(id));
    }
}
