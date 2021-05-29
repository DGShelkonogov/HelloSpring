package com.example.sukazaebalo;

import com.example.location.LocationController;
import com.example.location.LocationServise;
import com.example.post.PostController;
import com.example.post.PostService;
import com.example.user.UserController;
import com.example.user.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

@SpringBootApplication
@Import({ UserController.class, PostController.class, UserService.class,
        PostService.class, LocationServise.class, LocationController.class})
public class SukazaebaloApplication {

    public static void main(String[] args) {
        SpringApplication.run(SukazaebaloApplication.class, args);
    }

}
