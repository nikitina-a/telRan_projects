package com.company.commands;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;

public class Preview extends Command {

    private final String command = "PREVIEW";

    @Override
    public BufferedImage execute(BufferedImage plain) {

        JFrame f = new JFrame(); //creates jframe f
        // Exit the application and free memory
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize(); //this is your screen size
        ImageIcon image = new ImageIcon(plain); //imports the image
        JLabel lbl = new JLabel(image); //puts the image into a jlabel
        f.getContentPane().add(lbl); //puts label inside the jframe
        f.setSize(image.getIconWidth(), image.getIconHeight()); //gets h and w of image and sets jframe to the size
        int x = (screenSize.width - f.getSize().width)/2; //These two lines are the dimensions
        int y = (screenSize.height - f.getSize().height)/2;//of the center of the screen
        f.setLocation(x, y); //sets the location of the jframe
        f.setVisible(true); //makes the jframe visible

        return plain;
    }

    @Override
    public String getCommand() {
        return command;
    }
}
