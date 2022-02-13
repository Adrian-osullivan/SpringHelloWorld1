package com.example.springhelloworld1;

import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import org.springframework.web.bind.annotation.*;
import java.util.Calendar;
import java.text.SimpleDateFormat;



@RestController
@RequestMapping("/api/v1")
public class HelloService {
    public static final String DATE_FORMAT_NOW = "yyyy-MM-dd HH:mm:ss";

    @RequestMapping("/")
    public String index() {
        return "Hello World 2022...";
    }
    @RequestMapping("/abc")
    public String index2() {
        return "Hello World from Spring Boot (abc) " + now();
    }

    public static String now() {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT_NOW);
        return sdf.format(cal.getTime());
    }

    @RequestMapping("/sayHello/{message}")
    public String HelloWorldPathParm(@PathVariable String message) {
        return "Hello World with message " + message;
    }
    @RequestMapping("/sayHello/{firstName}/{lastName}")
    public String HelloWorldPathParm1(@PathVariable String firstName, @PathVariable String lastName ) {
        return "Hello World with name " + firstName + " " + lastName;
    }

    @RequestMapping("/sayHello")
    public String HelloWorldPathParm1(@RequestParam String name, @RequestParam int age ) {
        return "Your name is " + name + " and your age is " + age;
    }

    @RequestMapping("/someperson")
    public Person getPerson() {
        return new Person("Joe", "Bloggs", 20);
    }
    @PostMapping("/someperson")
    public String postPerson(@RequestBody Person person) {
        return person.getFirstName() + " " + person.getLastName() + " " + person.getAge();
    }
}
