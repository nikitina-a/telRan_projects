package com.company.service;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
public class MyFileReader {

    private final String FILE_PATH = "my_file.csv";
    private final BufferedReader br;

    public MyFileReader() {

        this.br = readFile();
    }

    public String getFILE_PATH() {
        return FILE_PATH;
    }

    public BufferedReader getBr() {
        return br;
    }

    private BufferedReader readFile () {

        BufferedReader br = null;

        try {

            br = new BufferedReader(new FileReader(FILE_PATH));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return br;
    }

}
