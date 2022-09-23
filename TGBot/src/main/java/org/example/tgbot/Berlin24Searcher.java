package org.example.tgbot;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Berlin24Searcher {
    private Document doc;
    private HashMap<String,String> linksByLabels;

    public Berlin24Searcher() {
        this.doc = getDoc();

    }

    public HashMap<String, String> getLinksByLabels() {
        return linksByLabels;
    }

    public static void main(String[] args) {
        Berlin24Searcher searcher = new Berlin24Searcher();
        searcher.getLinksAndLabels();
        //System.out.println(searcher.getLinksByLabels());
        CatalogParser parser = new CatalogParser(searcher,"Путешествия");
        parser.createCatalog();
        parser.getCatalog().forEach(System.out::println);
        //System.out.println(parser.getCatalog());
        //System.out.println(searcher.getLinksByLabels().get(parser.getMessage()));
    }

    private Document getDoc() {

        try {
            doc = Jsoup.connect("https://berlin24.ru").userAgent("Mozilla").get();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return doc;

    }
    public void getLinksAndLabels() {
        this.linksByLabels = new HashMap<>();

        Elements webPage = doc.body().getElementsByClass("block-accent block-menu col-menu");
        List<String> links = webPage.select("a").eachAttr("abs:href");
        List<String> labels = webPage.select("a").eachText();


        for (int i=0; i<labels.size(); i++) {
            this.linksByLabels.put(labels.get(i), links.get(i));
        }

    }

    public static List<String> getLabels() {
        List<String> labels = new ArrayList<>();
        Document doc = null;
        try {
            doc = Jsoup.connect("https://berlin24.ru").userAgent("Mozilla").get();
            Elements web = doc.body().getElementsByClass("block-accent block-menu col-menu");
            labels = web.select("a").eachText();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return labels;
        }

    }





