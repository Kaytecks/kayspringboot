package com.kay_springboot_project.kennyartifact;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class firstController {
    @GetMapping("/WELCOME")
    public String first_api(){

        return "Welcome To My Very First SpringBoot Deployment";
    }

}
