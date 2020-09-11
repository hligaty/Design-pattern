package com.example.chapter30.unit2.abstractfactory;

public class BMWVan extends AbsBMW {
  private final static String SEVENT_SEARIES = "7系列车型商务车";
  @Override
  public String getModel() {
    return SEVENT_SEARIES;
  }
}
