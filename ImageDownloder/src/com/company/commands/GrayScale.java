package com.company.commands;

import java.awt.color.ColorSpace;
import java.awt.image.BufferedImage;
import java.awt.image.ColorConvertOp;

public class GrayScale extends Command {

    private final String command = "GRAYSCALE";

    @Override
    public BufferedImage execute(BufferedImage plain) {
        ColorSpace cs = ColorSpace.getInstance(ColorSpace.CS_GRAY);
        ColorConvertOp op = new ColorConvertOp(cs, null);
        BufferedImage edited = op.filter(plain, null);
        return edited;
    }

    public String getCommand() {
        return command;
    }

}
