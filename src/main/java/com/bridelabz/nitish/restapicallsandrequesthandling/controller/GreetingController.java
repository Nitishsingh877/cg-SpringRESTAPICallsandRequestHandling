package com.bridelabz.nitish.restapicallsandrequesthandling.controller;


import com.bridelabz.nitish.restapicallsandrequesthandling.dto.GreetingService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    //UC02 Extend GreetingController to
    //use Services Layer to get Simple Greeting message ”Hello World”
    private final GreetingService greetingService;

   public GreetingController(GreetingService greetingService) {
       this.greetingService = greetingService;
   }

   @GetMapping("/greeting")
   public String greeting(){
       return greetingService.getGreetingMessage();
   }
}
