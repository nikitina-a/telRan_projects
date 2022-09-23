package com.company;

public class GarlandDecorator extends BaseTreeDecorator{

    public GarlandDecorator(IChristmasTree iChristmasTree) {
        super(iChristmasTree);
    }

    public String decorate() {
        return super.decorate() + decorateWithGarland();
    }

    private String decorateWithGarland() {
        return " with Garland";
    }
}
