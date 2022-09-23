package com.company.stack;

import java.util.Stack;

public class MinMaxStack extends Stack<Integer> {
    Stack<Integer> minStack;
    Stack<Integer> maxStack;

    public MinMaxStack() {
        this.minStack = new Stack<>();
        this.maxStack = new Stack<>();
    }

    public void push(int value) {
        if (value<=min()) {
            minStack.push(value);
        }
        if (value>=max()) {
            maxStack.push(value);
        }
        super.push(value);

    }
    public Integer pop() {
       int value = super.pop();
        if (value==min()) {
            minStack.pop();
        }
        if (value == max()) {
            maxStack.pop();
        }
        return value;
    }

    public int min() {
        if (minStack.isEmpty()) {
            return Integer.MAX_VALUE;
        } else {
            return minStack.peek();

        }
    }
    public int max() {
        if (maxStack.isEmpty()){
            return Integer.MIN_VALUE;
        } else {
            return maxStack.peek();
        }
    }
}

class Drive{
    public static void main(String[] args) {
        MinMaxStack minMaxStack = new MinMaxStack();
        minMaxStack.push(3);
        minMaxStack.push(6);
        minMaxStack.push(4);
        minMaxStack.push(21);
        minMaxStack.push(9);
        System.out.println(minMaxStack.min());
        System.out.println(minMaxStack.max());
        System.out.println(minMaxStack);
        minMaxStack.push(-1);
        minMaxStack.push(100);
        System.out.println(minMaxStack.min());
        System.out.println(minMaxStack.max());
    }

}
