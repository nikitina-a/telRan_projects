package com.company.service;

import java.io.BufferedReader;
import java.util.HashMap;

public class FileWriter {

    private final MyFileReader reader;
    private final HashMap<String,String> map;

    public FileWriter(MyFileReader reader) {
        this.reader = reader;
        this.map = writeFileIntoMap();
    }

    public HashMap<String, String> getMap() {
        return map;
    }

    public HashMap<String, String> writeFileIntoMap() {
        HashMap<String, String> map = new HashMap<>();
        BufferedReader br = this.reader.getBr();
        br.lines().forEach(l-> {
            String[] urls = l.split(",");
            map.put(urls[0], urls[1].trim());
        });
        //System.out.println(map);
        return map;
    }
}
