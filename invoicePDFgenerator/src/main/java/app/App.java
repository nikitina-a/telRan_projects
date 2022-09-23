package app;

import process.FileWriter;

import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter();
        writer.generateNewDocxFile();
    }
}
