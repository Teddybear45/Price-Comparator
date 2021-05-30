package com.tedg.springproductprice.ProductIndexers;

import com.tedg.springproductprice.ProductIndexers.PlatformIndexers.Ebay.EbayScraperObject;
import org.json.JSONException;
import org.json.JSONObject;

public class MainProductPrice {
    private final String key;

    public MainProductPrice(String key) {
        this.key = key;
    }


    public String retrivePriceData() {
        EbayScraperObject ebayData = new EbayScraperObject(key);

        return ebayData.scrape();

//        return jsonifyData();
    }


    private String jsonifyData() {
        JSONObject json = new JSONObject();
        try {
            json.put("TesterParam", "testval");


        } catch (JSONException e) {
            e.printStackTrace();
        }

        return json.toString();
    }

    public String getKey() {
        return key;
    }
}
