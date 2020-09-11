package com.example.chapter30.unit2.abstractfactory;

public class BenzSuv extends AbsBenz {
  private final static String G_SERIES = "G系列SUV";
  @Override
  public String getModel() {
    return G_SERIES;
  }
}
