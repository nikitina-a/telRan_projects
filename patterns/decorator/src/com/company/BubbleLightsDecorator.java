package com.company;

public class BubbleLightsDecorator extends BaseTreeDecorator{


    public BubbleLightsDecorator(IChristmasTree iChristmasTree) {
        super(iChristmasTree);
    }

    public String decorate() {
        return super.decorate() + decorateWithBubbleLights();
    }

    private String decorateWithBubbleLights() {
        return " with Bubble Lights";
    }
}
