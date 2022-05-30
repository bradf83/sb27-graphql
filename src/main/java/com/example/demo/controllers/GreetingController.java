package com.example.demo.controllers;

import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class GreetingController {

    @QueryMapping
    public String greeting() {
        return "Greetings From Spring Boot GraphQL";
    }
}
