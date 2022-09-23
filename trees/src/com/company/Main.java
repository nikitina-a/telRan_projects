package com.company;


import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
	MyTree bst = new MyTree();
    bst.insert(47);
    bst.insert(21);
    bst.insert(76);
    bst.insert(18);
    bst.insert(52);
    bst.insert(82);
    bst.insert(27);

       Iterator<Integer> bstIterator = bst.iterator();

       while (bstIterator.hasNext()){
           System.out.println(bstIterator.next());
       }


    }
}
