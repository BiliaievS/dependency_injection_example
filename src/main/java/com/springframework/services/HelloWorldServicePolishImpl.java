package com.springframework.services;

/**
 * Created by sbiliaiev on 06/07/17.
 */
public class HelloWorldServicePolishImpl implements HelloWorldService {
    @Override
    public String getGreeting() {
        return "Witaj świecie";
    }
}
