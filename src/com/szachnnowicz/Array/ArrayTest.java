package com.szachnnowicz.Array;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayTest {

    private Array array;

    @Before
    public void setUp() throws Exception {
        array = new Array();
    }


    @Test
    public void addBeginTest() {
        for (int i = 0; i < 10; i++) {
            array.addAtBegin(i);
            array.print();
        }
    }
    @Test
    public void addEndTest() {
        for (int i = 0; i < 10; i++) {
            array.addAtEnd(i);
            array.print();
        }
    }






}