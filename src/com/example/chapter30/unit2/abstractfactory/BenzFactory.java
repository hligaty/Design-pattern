package com.example.chapter30.unit2.abstractfactory;

public class BenzFactory implements CarFactory {
  @Override
  public ICar createSuv() {
    return new BenzSuv();
  }

  @Override
  public ICar createVan() {
    return new BenzVan();
  }
}
