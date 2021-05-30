package com.tedg.springproductprice.ProductIndexers.PlatformIndexers.Ebay;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class EbayScraperObject {
    private String key;
    public EbayScraperObject(String key) {
        this.key = key;
    }


    public String scrape() {
        String res = "empty";

        String url = "https://www.ebay.com/sch/i.html?_nkw=iPhone+7&_in_kw=1&_ex_kw=&_sacat=0&LH_Sold=1&_udlo=&_udhi=&_samilow=&_samihi=&_sadis=15&_stpos=98118&_sargn=-1%26saslc%3D1&_salic=1&_sop=12&_dmd=1&_ipg=50&LH_Complete=1&_fosrp=1";

        try {
            Document doc = Jsoup.connect(url).timeout(6000).get();

            System.out.println("in doc");

            Elements prodList = doc.select("ul> li.s-item");
            System.out.println(prodList.toString());
            System.out.println("prod ^");
            for (Element e : prodList) {
                e.select("span.s-item__price");
                System.out.println(e.select("span.s-item__price").html());
                System.out.println("loop e");

            }





        } catch (IOException e) {
            e.printStackTrace();
            res = e.toString();
        }

        return res;


    }


}
