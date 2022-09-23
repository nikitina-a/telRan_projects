package com.company;

import java.util.Comparator;
import java.util.Iterator;

public class My_Linked_List<T> implements MyList<T>{
    private int size;
    Node<T> head;
    Node<T> tail;

    private static class Node<T>{
        T data;
        Node<T> next;
        Node<T> prev;

        public Node(T data, Node<T> next, Node<T> prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }
    private Node<T> getNode(int index){
        if (index > size - 1 || index < 0) throw new IndexOutOfBoundsException();
        Node<T> current = this.head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }
    private Node<T> findNode(T el){
        Node<T> current = this.head;
        while (current!=null){
            if (el.equals(current.data)){
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public void addNode (T el){
        Node<T> newNode = new Node<>(el,null,this.tail);
        if (size == 0){
            this.tail = this.head = newNode;
        } else {
            this.tail.next = newNode;
            this.tail = newNode;
        }
        size++;

    }
    private void removeByNode(Node<T> toRemove){
        Node<T> left = toRemove.prev;
        Node<T> right = toRemove.next;

        toRemove.prev = toRemove.next  = null;
        toRemove.data = null;

        if (size == 1) {
            head= tail = null;
        } if (head == toRemove) {
            right.prev = null;
            head= right;
        } else if (tail == toRemove) {
            left.next = null;
            tail = left;
        } else {
            right.prev = left;
            left.next = right;
        }
        size--;
    }
    public T removeByIndex(int index){
        Node<T> toRemove = getNode(index);
        T result = toRemove.data;
        removeByNode(toRemove);
        return result;
    }
    public boolean removeByElement(T el){
        Node<T> toRemove = findNode(el);
        if (toRemove == null) {
            return false;
        }
        removeByNode(toRemove);
        return true;
    }
    @Override
    public int size() {
        return this.size;
    }

    @Override
    public void add(T el) {
        addNode(el);

    }

    @Override
    public T remove(int index) {
        return removeByIndex(index);
    }

    @Override
    public boolean remove(T el) {
        return removeByElement(el);
    }

    @Override
    public T get(int index) {
        return getNode(index).data;
    }

    @Override
    public void sort(Comparator<T> comparator) {

    }

    @Override
    public boolean contains(T el) {

        return findNode(el)!=null;
    }

    @Override
    public void set(int index, T el) {
        if (index > size || index < 0) throw new IndexOutOfBoundsException();
        Node<T> toChange = getNode(index);
        toChange.data = el;


    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }
}
