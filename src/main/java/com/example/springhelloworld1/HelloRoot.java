package com.example.springhelloworld1;

import org.springframework.web.bind.annotation.*;

import java.util.Calendar;
import java.text.SimpleDateFormat;


@RestController
@RequestMapping("/root")
public class HelloRoot {
    @RequestMapping("/")
    public String index() {
        return "Hello World from Spring Boot root " + now();
    }
    public static final String DATE_FORMAT_NOW = "yyyy-MM-dd HH:mm:ss";
    public static String now() {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT_NOW);
        return sdf.format(cal.getTime());
    }
}


