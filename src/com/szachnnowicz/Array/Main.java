package com.szachnnowicz.Array;

import java.util.Random;

public class Main {


    public static void main(String[] args) {

        Array array = new Array();
        for (int i = 0; i < 10; i++) {
            array.addAtEnd(i);
        }
        for (int i = 0; i < 10; i++) {
            array.deleteAtIndex(0);
            array.print();
        }


    }


}
