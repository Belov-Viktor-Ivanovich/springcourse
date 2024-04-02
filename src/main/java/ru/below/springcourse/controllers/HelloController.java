package ru.below.springcourse.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @Value("${hello}")
    private String name;

    @GetMapping("/hello")
    public String hello() {
        System.out.println(this.name);
        return "hello";
    }
}
