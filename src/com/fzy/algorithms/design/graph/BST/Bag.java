package com.fzy.algorithms.design.graph.BST;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Created by fuzeyi on 2017/5/28.
 */
public class Bag<Item> implements Iterable<Item> {
    private int N; // number of elements in bag
    private Node<Item> first; // beginning of bag

    public Bag(){
        first = null;
        N = 0;
    }

    @Override
    public Iterator<Item> iterator() {
        return new ListIterator<Item>(first);
    }

    public boolean isEmpty(){
        return first == null;
    }

    public int size(){
        return N;
    }

    public void add(Item item){
        Node<Item> oldFirst = first;
        first = new Node<Item>();
        first.item = item;
        first.next = oldFirst;
        N++;
    }

    private class Node<Item>{
        private Item item;
        private Node<Item> next;
    }

    private class ListIterator<Item> implements Iterator<Item> {

        private Node<Item> current;

        public ListIterator(Node<Item> first){
            this.current = first;
        }

        @Override
        public boolean hasNext() {
            return current!=null;
        }

        @Override
        public void remove()      {
            throw new UnsupportedOperationException();
        }

        @Override
        public Item next() {
            if(!hasNext()){
                throw new NoSuchElementException();
            }
            Item item = current.item;
            current = current.next;
            return item;
        }
    }
    public static void main(String[] args) {
        Bag<String> bag = new Bag<String>();
        while (!StdIn.isEmpty()) {
            String item = StdIn.readString();
            bag.add(item);
        }

        StdOut.println("size of bag = " + bag.size());
        for (String s : bag) {
            StdOut.println(s);
        }
    }
}
