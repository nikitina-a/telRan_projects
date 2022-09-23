package com.company;

import com.company.service.Editor;
import com.company.service.FileWriter;
import com.company.service.MyFileReader;
import com.company.service.PrintFile;

import java.io.IOException;

public class ImageApp {

    public static void main(String[] args) throws IOException {

        MyFileReader reader = new MyFileReader();
        PrintFile printing = new PrintFile(reader);
        //printing.printFile();

        FileWriter writer = new FileWriter(reader);
       // System.out.println(writer.getMap());

        Editor edit = new Editor(writer);
        edit.editImages();
    }
}
