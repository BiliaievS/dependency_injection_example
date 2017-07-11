package com.springframework.services;

/**
 * Created by sbiliaiev on 05/07/17.
 */
public class HelloWorldServiceEnglishImpl implements HelloWorldService {
    @Override
    public String getGreeting() {
        return "Hello World";
    }
}
