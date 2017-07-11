package com.springframework.services;

/**
 * Created by sbiliaiev on 08/07/17.
 */
public class HelloWorldServiceGermanImpl implements HelloWorldService {
    @Override
    public String getGreeting() {
        return "Hello Welt";
    }
}
