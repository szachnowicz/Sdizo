package com.szachnnowicz;

import java.time.Duration;
import java.time.Instant;
import java.util.Random;

public class ArrayTest {


    public static void main(String[] args) {


        firstAdding();


    }

    private static void firstAdding() {
        long startTime = System.nanoTime();
        new ArrayTest().addingTest();
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("Czas dodawania  pierwsze " + (float) (duration / 100000) + "[ms]");
    }




    public void addingTest() {

        Array array = new Array();
        Random random = new Random();
        for (int i = 0; i < 100000; i++) {
            array.add(random.nextInt());
        }

    }


}
