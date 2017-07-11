package com.springframework.services;

/**
 * Created by sbiliaiev on 06/07/17.
 */
public class HelloWorldFactory {

    public HelloWorldService createHelloWorldService(String languageCode) {
        HelloWorldService service = null;

        switch (languageCode){
            case "en":
                service = new HelloWorldServiceEnglishImpl();
                break;
            case "es":
                service = new HelloWorldServiceSpanishImpl();
                break;
            case "pl":
                service = new HelloWorldServicePolishImpl();
                break;
            case "ru":
                service = new HelloWorldServiceRussianImpl();
                break;
            case "de":
                service = new HelloWorldServiceGermanImpl();
                break;
            case "fr":
                service = new HelloWorldServiceFrenchImpl();
                break;
            default: new HelloWorldServiceEnglishImpl();
        }

        return service;
    }
}
