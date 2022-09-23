package com.company.service;

import com.company.commands.Command;
import com.company.loader.Loader;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.util.Map;


public class Editor {

    private FileWriter writer;

    public Editor(FileWriter writer) {

        this.writer = writer;
    }

    public void editImages() throws IOException {
        var map = writer.getMap();
        int count = 0;
        //System.out.println(map);

        outerFor:
        for (Map.Entry pair : map.entrySet()) {
            for (Command command : Loader.classes) {
            //boolean equal = pair.getValue().equals(command.getCommand());
            if (command.getCommand().equals(pair.getValue())) {
                    URL imageURL = new URL((String) pair.getKey());
                    BufferedImage image = ImageReader.readImage(imageURL);
                    ImageSaver.saveImage(command.execute(image), count++);
                    continue outerFor;
                }

            }

        }
    }


}




