package de.telran.shapes.model;

public class Line implements Shape{

    private char symbol;
    private int length;

    public Line(char symbol, int length) {
        this.symbol = symbol;
        this.length = length;
    }

    @Override
    public void draw() {
        for (int i = 0; i < length; i++) {
            System.out.print(symbol);
        }
        System.out.println();
    }

    public char getSymbol() {
        return symbol;
    }

    public int getLength() {
        return length;
    }
}
