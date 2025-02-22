package com.bridelabz.nitish.restapicallsandrequesthandling.controller;


import com.bridelabz.nitish.restapicallsandrequesthandling.dto.GreetingService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    //UC02 Extend GreetingController to
    //use Services Layer to get Simple Greeting message ”Hello World”
    private final GreetingService greetingService;
    @Autowired
   public GreetingController(GreetingService greetingService) {
       this.greetingService = greetingService;
   }

   @GetMapping("/greeting")
   public String greeting(){
       return greetingService.getGreetingMessage();
   }
//uc03
   @GetMapping("/greeting/name")
    public String greeting(@RequestParam(name = "firstName",required = false) String firstName, @RequestParam(name = "lastName",required = false) String lastName) {
       return greetingService.getGreeting(firstName, lastName);
   }

}
