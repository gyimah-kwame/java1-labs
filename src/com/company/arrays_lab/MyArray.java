package com.company.arrays_lab;

public class MyArray {

    private int[] data;
    private final int  size;

    public MyArray(int size) {
        this.size = size;

        data = new int[size];

        for (int i=0; i<size; i++) {
            data[i] = i+1;
        }
    }

    public int[] getData() {
        return data;
    }

}
