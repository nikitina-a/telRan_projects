package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Iterator;
import java.util.NoSuchElementException;



class MyTreeTest {

    MyTree tree;
    Iterator<Integer> iterator;


    @BeforeEach
    void init(){
        tree=new MyTree();


    }


    @Test
    void checkHasNextOneElement(){
        tree.insert(1);
        iterator=tree.iterator();

        Assertions.assertTrue(iterator.hasNext());

    }
    @Test
    void checkHasNextOneElementWithCallingNextMethod(){
        tree.insert(1);
        iterator=tree.iterator();
        iterator.next();
        Assertions.assertFalse(iterator.hasNext());

    }

    @Test
    void testIteratorIfTreeIsNotEmptyOneElement(){
        tree.insert(1);
        iterator=tree.iterator();
        Integer expected = 1;
        Assertions.assertEquals(expected,iterator.next());

    }
    @Test
    void testIteratorIfTreeIsNotEmptyFewElements(){
        tree.insert(1);
        tree.insert(2);
        tree.insert(3);
        iterator=tree.iterator();
        iterator.next();
        Integer expected = 2;
        Assertions.assertEquals(expected,iterator.next());

    }

    @Test
    void testIteratorIfTreeIsEmpty(){
        iterator=tree.iterator();
        Assertions.assertThrows(NoSuchElementException.class,()->iterator.next());

    }

}