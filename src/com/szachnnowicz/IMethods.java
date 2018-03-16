package com.szachnnowicz;

public interface IMethods<T> {
    void add(T item);

    void delete(int index);

    void delete(T item);

    T search(int index);

    int search(T Item);

}

