package com.company;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public interface MyList<T> extends Iterable<T> {

    int size();
    void add(T el);
    T remove(int index);
    boolean remove(T el);
    T get(int index);
    void sort(Comparator<T> comparator);
    boolean contains(T el);
    void set(int index, T el);

}
