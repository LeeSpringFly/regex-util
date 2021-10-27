package com.example.regexutil.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

    @GetMapping("/")
    public String demo() {
        System.out.println("DEMO");
        return "demo";
    }
}
