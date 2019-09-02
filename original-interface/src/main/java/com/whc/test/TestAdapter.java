package com.whc.test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestAdapter {
  public static void main(String[] args) {
    CommonAdapter commonAdapter1 = AdapterFactory.createInstance("1");
    commonAdapter1.printLogA();

    CommonAdapter commonAdapter2 = AdapterFactory.createInstance("2");
    commonAdapter2.printLogA();

    CommonAdapter commonAdapter3 = AdapterFactory.createInstance("3");
    commonAdapter3.printLogB();

    Date now = new Date();
    DateFormat fmt = new SimpleDateFormat("yyyy-MM-dd(EEE) HH:mm:ss");
    String dateStr = fmt.format(now);

    String a = "s";
  }
}
