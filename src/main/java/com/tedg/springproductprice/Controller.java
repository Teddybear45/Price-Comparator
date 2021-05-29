package com.tedg.springproductprice;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.tedg.springproductprice.ProductIndexers.MainProductPrice;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import org.json.JSONObject;




@RestController
public class Controller {
    @GetMapping("/api/hello")
    public String hello() {
        return "Hello, the time at the server is now " + new Date() + "\n";
    }

    @PostMapping("/api/hello")
    public String postBody(@RequestBody String productKey) {
        try {
            JSONObject obj = new JSONObject(productKey);

            MainProductPrice res = new MainProductPrice(obj.getString("productKey"));

            return res.retrivePriceData();
        }
        catch (Exception e) {
            return "Post obj Error";
        }

    }




}

class Product {
    private String key;

    public Product(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}