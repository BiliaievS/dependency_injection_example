package com.springframework.services;

/**
 * Created by sbiliaiev on 05/07/17.
 */
public class HelloWorldServiceSpanishImpl implements HelloWorldService {
    @Override
    public String getGreeting() {
        return "Hola mundo!";
    }
}
