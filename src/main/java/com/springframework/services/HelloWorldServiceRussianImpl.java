package com.springframework.services;

/**
 * Created by sbiliaiev on 06/07/17.
 */
public class HelloWorldServiceRussianImpl implements HelloWorldService {
    @Override
    public String getGreeting() {
        return "Privet mir";
    }
}
