package com.tedg.springproductprice.ProductIndexers.PlatformIndexers;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public abstract class ScraperObject {
    private Document document;
    private final String key;

    public ScraperObject(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }

    public abstract void setDocumentURL();
}
