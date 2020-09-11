package com.example.chapter31.unit2.adapter;

public class Duckling implements Duck {
  @Override
  public void cry() {
    System.out.println("叫声是嘎——嘎——嘎");
  }

  @Override
  public void desAppearance() {
    System.out.println("外形是黄白相间，嘴长");
  }

  @Override
  public void desBehavior() {
    System.out.println("会游泳");
  }
}
