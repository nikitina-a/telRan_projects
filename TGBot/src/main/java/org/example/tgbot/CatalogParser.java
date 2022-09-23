package org.example.tgbot;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CatalogParser {
   private Berlin24Searcher searcher;
   private String message;
   private List<String> catalog;


    public CatalogParser(Berlin24Searcher searcher, String message) {
        this.searcher = searcher;
        this.message = message;
    }

    public List<String> getCatalog() {
        return catalog;
    }

    public String getMessage() {
        return message;
    }

    public void createCatalog() {

        this.catalog = new ArrayList<>();

        try {
            System.out.println(this.searcher.getLinksByLabels());
            Document doc = Jsoup.connect(this.searcher.getLinksByLabels().get(message)).userAgent("Mozilla").get();
            // next pages if exist
            Elements next = doc.body().getElementsByClass("pagination");

            List<String> links = next.select("a").eachAttr("abs:href");

            if (links.isEmpty()) {
                // first page
                Elements catalog = doc.body().getElementsByClass("catalog");
                this.catalog = catalog.select("tbody").eachText();
            } else {
                for (String link:links) {
                    Document currentDoc = Jsoup.connect(link).userAgent("Mozilla").get();
                    Elements catalogNext = currentDoc.body().getElementsByClass("catalog");
                    List<String> nextPage = catalogNext.select("tbody").eachText();
                    this.catalog.addAll(nextPage);
                }
            }


        } catch (IOException e) {
            e.printStackTrace();
        }

    }



}
