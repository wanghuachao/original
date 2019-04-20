package com.whc.test;

public class TestAdapter {
    public static void main(String[] args) {
        CommonAdapter commonAdapter1 = AdapterFactory.createInstance("1");
        commonAdapter1.printLogA();


        CommonAdapter commonAdapter2 = AdapterFactory.createInstance("2");
        commonAdapter2.printLogA();


        CommonAdapter commonAdapter3 = AdapterFactory.createInstance("3");
        commonAdapter3.printLogB();
    }
}
