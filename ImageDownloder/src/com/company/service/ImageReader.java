package com.company.service;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

public class ImageReader {
    public static BufferedImage readImage (URL url) throws IOException {
        return ImageIO.read(url);
    }
}
