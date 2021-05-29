package com.example.sukazaebalo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelkomeController {
    @RequestMapping( "/w")
    public static String wel(){
        return "Wrelkome";
    }
}
