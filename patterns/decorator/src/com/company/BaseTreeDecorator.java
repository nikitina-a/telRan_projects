package com.company;

public abstract class BaseTreeDecorator implements IChristmasTree {
    private IChristmasTree iChristmasTree;

    public BaseTreeDecorator(IChristmasTree iChristmasTree) {
        this.iChristmasTree = iChristmasTree;
    }

    @Override
    public String decorate() {
        return iChristmasTree.decorate();
    }
}
