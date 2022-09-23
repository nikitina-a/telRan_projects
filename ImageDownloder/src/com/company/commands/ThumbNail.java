package com.company.commands;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public  class ThumbNail extends Command {

    private final String command = "THUMBNAIL";

    @Override
    public BufferedImage execute(BufferedImage plain) {

        BufferedImage thumb = new BufferedImage(100, 200,
                BufferedImage.TYPE_INT_RGB);

        Graphics2D g2d = (Graphics2D) thumb.getGraphics();
        g2d.drawImage(plain, 0, 0, thumb.getWidth() - 1, thumb.getHeight() - 1, 0, 0,
                plain.getWidth() - 1, plain.getHeight() - 1, null);
        g2d.dispose();
        return thumb;
    }

    @Override
    public String getCommand() {
        return this.command;
    }

}

