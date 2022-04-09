package com.example.spring_initializr2;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloWorldController {

    @RequestMapping("/")
    public String index() {
        return "Hello World";
    }

    @RequestMapping("/list")
    public List<String> hello() {
        return List.of("Hello", "World");
    }

    // http://localhost:8080/listHello?id=1&id=2&id=6&id=9
    @RequestMapping("/listHello")
    public String listHello(@RequestParam List<String> id) {
        return "IDs are " + id;
    }

    // http://localhost:8080/hello?firstName=Roberto&lastName=M%C3%A9ndez
    @RequestMapping("/hello")
    public String index(@RequestParam String firstName,
                        @RequestParam String lastName) {

        return ("Hello " + firstName + " " + lastName);
    }

    // http://localhost:8080/pathVariable/5
    @RequestMapping("/pathVariable/{id}")
    public String pathVariableTest(@PathVariable String id) {
        return "ID: " + id;
    }


    @RequestMapping("/helloHTML")
    public String helloHTML(@RequestParam String firstname, @RequestParam String lastname) {
        return "<h1>Hejsan " + firstname + " " + lastname + "</h1>";
    }

}