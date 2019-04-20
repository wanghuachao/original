package com.whc.test;

public class FirstAdapter extends CommonAdapter {
    @Override
    public void printLogA() {
        super.printLogA();
        System.out.println("I am FirstAdater's method printLogA");
    }

    @Override
    public void printLogB() {
        super.printLogB();
        System.out.println("I am FirstAdater's method printLogB");
    }

    @Override
    public void printLogC() {
        super.printLogC();
        System.out.println("I am FirstAdater's method printLogC");
    }
}
