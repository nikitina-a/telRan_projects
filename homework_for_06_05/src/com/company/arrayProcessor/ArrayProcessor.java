package com.company.arrayProcessor;

import java.util.Arrays;

public class ArrayProcessor {


    public static void main(String[] args) {

        System.out.println(Arrays.toString(getArray(new MyRandomCreator())));
        System.out.println(Arrays.toString(getArray(new MyScannerCreator())));

    }
    public static int [] getArray(ArrayCreator arrayCreator) {
        return arrayCreator.createArray();
    }

}
