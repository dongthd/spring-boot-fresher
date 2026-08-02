package com.springboot.fresher.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/info")
    public String getInfo() {

        return "Hello DongTHD";
    }
}
