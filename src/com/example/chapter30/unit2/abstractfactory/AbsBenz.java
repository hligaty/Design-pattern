package com.example.chapter30.unit2.abstractfactory;

public abstract class AbsBenz implements ICar {
  private final static String BENZ_BAND = "奔驰汽车";
  @Override
  public String getBand() {
    return BENZ_BAND;
  }
}
