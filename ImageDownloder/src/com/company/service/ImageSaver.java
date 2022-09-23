package com.company.service;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageSaver {
    public static void saveImage(BufferedImage image, int count) throws IOException {
        ImageIO.write(image, "jpg", new File("C:/telRan_projects/ImageDownloder/picture" + count +".jpg"));
    }
}
