package com.company;

public class Main {

    public static void main(String[] args) {
	IChristmasTree christmasTree1 = new GarlandDecorator(new BubbleLightsDecorator(new ChristmasTree()));
    IChristmasTree christmasTree2 = new BubbleLightsDecorator(new ChristmasTree());

        System.out.println(christmasTree1.decorate());
        System.out.println(christmasTree2.decorate());
    }
}
