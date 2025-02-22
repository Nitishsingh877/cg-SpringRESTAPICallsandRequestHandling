package com.bridelabz.nitish.restapicallsandrequesthandling.dto;

public class Greeting {
    private String count;
    private String greetingMessage;

    public Greeting(long l, String format) {
        this.count = String.valueOf(l);
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public String getGreetingMessage() {
        return greetingMessage;
    }

    public void setGreetingMessage(String greetingMessage) {
        this.greetingMessage = greetingMessage;
    }
}
