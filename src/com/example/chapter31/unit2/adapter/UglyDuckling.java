package com.example.chapter31.unit2.adapter;

public class UglyDuckling extends WhiteSwan implements Duck {
  @Override
  public void desAppearance() {
    super.desAppaearance();
  }

  @Override
  public void desBehavior() {
    System.out.println("会游泳");
    super.fly();
  }

  @Override
  public void cry() {
    super.cry();
  }
}
