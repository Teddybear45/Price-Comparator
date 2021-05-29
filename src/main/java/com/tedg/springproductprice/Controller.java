package com.tedg.springproductprice;

import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
public class Controller {
    @GetMapping("/api/hello")
    public String hello() {
        return "Hello, the time at the server is now " + new Date() + "\n";
    }

    @PostMapping("/api/hello")
    public String postBody(@RequestBody String productKey) {
        return "Hello" + productKey;
    }




}
