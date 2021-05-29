package com.tedg.springproductprice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class Controller {
    @GetMapping("/api/hello")
    public String hello() {
        return "Hello, the time at the server is now " + 123 + "\n";
    }

}