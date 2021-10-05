package com.company.tut;

public class Tut {

    public static void main(String[] args) {
        MountainBicycle mountainBicycle = new MountainBicycle(1, 10);
        Bicycle bicycle = new MountainBicycle(20,10);
        Bicycle bicycle1 = new Bicycle(1, 2);

        mountainBicycle.location();

        bicycle1.location();
    }
}
