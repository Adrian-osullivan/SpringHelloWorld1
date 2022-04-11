package com.example.springhelloworld1;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Calendar;
import java.text.SimpleDateFormat;

/**
 * hello root class
 */
@RestController
@RequestMapping("/root")
public final class HelloRoot {
    @RequestMapping("/")
    public String index() {
        return "Hello World from Spring Boot root (changed 18:52 on 11-Apr-22) " + now();
    }
    public static final String DATE_FORMAT_NOW = "yyyy-MM-dd HH:mm:ss";
    public static String now() {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT_NOW);
        return sdf.format(cal.getTime());
    }
}


