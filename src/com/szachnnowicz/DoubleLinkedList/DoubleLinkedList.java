package com.szachnnowicz.DoubleLinkedList;

import com.szachnnowicz.IMethods;

import java.util.NoSuchElementException;

public class DoubleLinkedList<T> implements IMethods<T> {
    int size = 0;

    private Element head;
    private Element tail;

    //http://www.java2novice.com/data-structures-in-java/linked-list/doubly-linked-list/
    @Override
    public void addAtEnd(T item) {
        Element temp = new Element(item);
        temp.prev = tail;
        if (tail != null) tail.next = temp;
        tail = temp;
        if (head == null) {
            head = temp;
        }
        size++;
    }

    @Override
    public void addAtBegin(T item) {
        Element newE = new Element(item);
        newE.next = head;
        if (head != null) head.prev = newE;
        head = newE;
        if (tail == null) tail = newE;
        size++;

    }

    @Override
    public void addAtIndex(T item, int index) {
        if (addFirstOrLast(item, index)) return;

        Element newE = new Element(item);
        if (index >= size) throw new NoSuchElementException();

        Element current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        newE.prev = current.prev;
        newE.next = current;
        current.prev.next = newE;

        size++;
    }

    private boolean addFirstOrLast(T item, int index) {
        if (index == 0) {
            addAtBegin(item);
            return true;
        }

        if (index == size) {
            addAtEnd(item);
            return true;
        }
        return false;
    }

    private boolean deleteFirstOrLast(int index) {
        if (index == 0) {
            deleteAtBegin();
            return true;
        }

        if (index == size) {
            deleteAtEnd();
            return true;
        }
        return false;
    }

    @Override
    public void deleteAtEnd() {
        Element tmp = tail;
        tail = tail.prev;
        tail.next = null;
        size--;

    }

    @Override
    public void deleteAtBegin() {
        Element tmp = head;
        head = head.next;
        head.prev = null;
        size--;

    }

    @Override
    public void deleteAtIndex(int index) {
        if (deleteFirstOrLast(index)) return;
        if (index >= size) throw new NoSuchElementException();

        Element current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        current.next = current.next.next;


    }

    @Override
    public int search(T item) {
        Element current = head;
        for (int i = 0; i < size; i++) {
            if(current.data==item) return i;
            current = current.next;
        }


        return -1;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        } else {
            Element current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }

            return current.data;
        }

    }


    public void display() {
        Element element = head;
        for (int i = 0; i < size; i++) {
            System.out.println("[" + i + "]" + " - " + element.data);
            element = element.next;
        }
        System.out.println("------------");

    }


    private class Element {
        private T data;
        Element next, prev;

        public Element(T data) {
            this.data = data;
        }

    }
}
