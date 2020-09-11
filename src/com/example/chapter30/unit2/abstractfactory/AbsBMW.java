package com.example.chapter30.unit2.abstractfactory;

public abstract class AbsBMW implements ICar {
  private final static String BMW_BAND = "宝马汽车";
  @Override
  public String getBand() {
    return BMW_BAND;
  }

}
