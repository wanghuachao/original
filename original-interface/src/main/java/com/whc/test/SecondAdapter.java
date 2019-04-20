package com.whc.test;

public class SecondAdapter extends CommonAdapter {
    @Override
    public void printLogA() {
        super.printLogA();
        System.out.println("I am SecondAdapter's method printLogA");
    }

    @Override
    public void printLogB() {
        super.printLogB();
        System.out.println("I am SecondAdapter's method printLogB");
    }

    @Override
    public void printLogC() {
        super.printLogC();
        System.out.println("I am SecondAdapter's method printLogC");
    }
}
