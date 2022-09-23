package com.company.arrayProcessor;

import java.util.Random;
import java.util.Scanner;

public class MyRandomCreator implements ArrayCreator{
    private int size;
    private Random rd;
    int[] array;

    public int getSize() {
        return size;
    }

    @Override
    public int[] createArray() {
        rd = new Random();
        this.size= rd.nextInt(10);
        this.array=new int[this.size];
        for (int i = 0; i < this.size; i++) {
            this.array[i] = rd.nextInt(10);
        }

        return this.array;

    }
}
