package com.company.tut;

public class MountainBicycle extends Bicycle{

    public MountainBicycle(int speed, int gear) {
        super(speed, gear);
    }

    @Override
    public void location() {
        super.location();
        System.out.println("mountain bicyle");
    }
}
