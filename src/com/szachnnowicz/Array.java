package com.szachnnowicz;

public class Array implements IMethods<Integer> {

    public int array[] = new int[0];


    @Override
    public void add(Integer item) {
        int tempArr[] = new int[array.length + 1];
        System.arraycopy(array, 0, tempArr, 0, array.length);
        array = tempArr;
        array[array.length - 1] = item;
    }


    public void addSecond(Integer item) {
        if (array.length == 0) {
            array[0] = item;
        }

        int tempArr[] = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            tempArr[i] = array[i];
        }
        tempArr[array.length] = item;
        array = tempArr;
    }


    @Override
    public void delete(int index) {
        

    }

    @Override
    public void delete(Integer item) {

    }

    @Override
    public Integer search(int index) {
        return null;
    }

    @Override
    public int search(Integer Item) {
        return 0;
    }


}
