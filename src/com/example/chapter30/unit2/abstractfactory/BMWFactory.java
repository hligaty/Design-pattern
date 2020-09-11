package com.example.chapter30.unit2.abstractfactory;

public class BMWFactory implements CarFactory {
  @Override
  public ICar createSuv() {
    return new BMWSuv();
  }

  @Override
  public ICar createVan() {
    return new BMWVan();
  }
}
