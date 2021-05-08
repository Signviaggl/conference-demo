package com.pluralsight.conferencedemo.controllers;

import com.pluralsight.conferencedemo.models.Message;
import java.lang.String;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class democontroller {
    private String message;

    @GetMapping("/demo")
    Message send() {
        return new Message("this is amzaing");
    }

}
