package com.company.tut;

import java.util.Comparator;

public class MyComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer a, Integer b) {

        if(a > b) {
            return 1;
        }else if (a < b) {
            return -1;
        }
        return 0;

    }
}
