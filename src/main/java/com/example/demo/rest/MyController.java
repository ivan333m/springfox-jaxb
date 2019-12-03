package com.example.demo.rest;

import com.example.demo.domain.MyBox;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @PostMapping("/box")
    public String post(@RequestBody MyBox myBox) {
        return "Success";
    }
}
