package com.example.chapter30.unit2.abstractfactory;

public class BMWSuv extends AbsBMW {
  private final static String X_SEARIES = "X系列车型SUV";
  @Override
  public String getModel() {
    return X_SEARIES;
  }
}
