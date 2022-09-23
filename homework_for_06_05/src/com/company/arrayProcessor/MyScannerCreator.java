package com.company.arrayProcessor;

import java.util.Scanner;

public class MyScannerCreator implements ArrayCreator{
    private int size;
    private Scanner sc;
    int[] array;

    public int getSize() {
        return size;
    }

    @Override
    public int[] createArray() {
        sc = new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store: ");
        this.size = sc.nextInt();
        this.array=new int[this.size];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<this.size; i++) {
            this.array[i]=sc.nextInt();
        }
        return this.array;
    }
}
