package com.company.linkedlist;

public class MyList {
    public static void main(String[] args) {
        MyLinkedListAnotherOne poezd = new MyLinkedListAnotherOne();
        poezd.addToHead(-3);
        poezd.addToHead(-6);
        poezd.addToTail(9);
        poezd.addToTail(8);
        //poezd.print();
        poezd.addBeforeElement(-6,8);
        poezd.changeToAbs();
        //System.out.println(poezd.countValues(9));
        poezd.print();
        System.out.println();
        System.out.println(poezd.countPairs());

    }
}
