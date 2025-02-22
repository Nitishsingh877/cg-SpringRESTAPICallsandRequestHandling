package com.bridelabz.nitish.restapicallsandrequesthandling.controller;

import com.bridelabz.nitish.restapicallsandrequesthandling.dto.Greeting;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("api/v4")
public class ControllerContainer {
    //uc01
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(),
                String.format(template, name));
    }

    //Ability for the Greeting App to
    //give Greeting message with
    //
    //1. User First Name and Last
    //Name or
    //2. With just First Name or Last
    //Name based on User
    //attributes provides or
    //3. Just Hello World.

}
