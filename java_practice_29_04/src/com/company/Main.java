package com.company;

public class Main {

    public void main(String[] args) {
	// write your code here
        System.out.println(getLongestSec("abbbc"));
        System.out.println(getLongestSec(""));
    }

    public int getLongestSec(String input) {
        if (input.equals("")) return 0;
        int count = 1;
        int max = 1;

        for (int i = 0; i < input.length() - 1; i++) {
            if(input.substring(i,i+1).equals(input.substring(i+1,i+2))) {
                count++;
            } else {
                count=1;
            }

            if(count>max) {
                max = count;
            }

        }
        return max;
    }

    public static int getMaxElement(int[] input) {
        if (input == null) throw new IndexOutOfBoundsException();
        int max = input[0];
        boolean isNegative = false;
        for (int i = 0; i < input.length; i++) {
            if (input[i]>0) {
                if(input[i]>max) {
                    max = input[i];
                }
            }
            isNegative = true;
        }

        if (isNegative) return -1;

        return max;
    }
}
