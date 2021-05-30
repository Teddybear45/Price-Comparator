package com.tedg.springproductprice;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class ScraperTest {

    public static void main(String[] args) {
        String res = "empty";

        String url = "";

        try {
            Document doc = Jsoup.connect(url).timeout(6000).get();

            System.out.println("in doc");
            System.out.println(doc);

            Elements prodList = doc.select("ul.srp-results");
            System.out.println("prodlist");
            System.out.println(prodList.toString());
            for (Element e : prodList) {
                System.out.println("loop e");

            }
        } catch (IOException e) {
            e.printStackTrace();
            res = e.toString();
        }
    }
}
