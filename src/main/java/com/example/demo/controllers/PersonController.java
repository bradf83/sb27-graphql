package com.example.demo.controllers;

import java.util.List;

import com.example.demo.models.Person;

import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;

@Controller
public class PersonController {

    @QueryMapping
    public List<Person> allPeople() throws Exception {
        // Test Exception
        // if (1 == 1) {
        // throw new Exception("Error");
        // }

        return List.of(new Person(1, "One", "Canada"), new Person(2, "Two", "United States"));
    }

    @SchemaMapping
    // @Secured({ "ROLE_MANAGER" }) - Does not work
    // @PreAuthorize("hasRole('MANAGER')") // - Works
    public String sin(Person person) throws Exception {
        // Test Exception
        // if (person.id() == 1) {
        // throw new Exception("Error");
        // }
        System.out.println("Looking up SIN for " + person.toString());
        return "A.B.C";
    }
}
