package com.szachnnowicz;

import java.time.Duration;
import java.time.Instant;

public abstract class TestClass  {

    public void runAllTests() {

        Instant start = Instant.now();

        Instant end = Instant.now();
        System.out.println(Duration.between(start, end));


    }

    public abstract void addingTest();

    public abstract void removingByIndexTest();

    public abstract void removingByItemTest();

    public abstract void searchByIndexTest();

    public abstract void searchByObjectTest();


}
