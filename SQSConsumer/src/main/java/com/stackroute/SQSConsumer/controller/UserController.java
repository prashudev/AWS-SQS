package com.stackroute.SQSConsumer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class UserController {

    @GetMapping("/message")
    public String getMessage() {
        return "Hi Good Afternoon, Have a nice day Consumer";
    }
}