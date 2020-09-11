package com.example.chapter31.unit2.decorative;

public class StrongBehavior extends Decorator {
  public StrongBehavior(Swan swan) {
    super(swan);
  }

  /**
   * 会飞了
   */
  @Override
  public void fly() {
    System.out.println("会飞行了！");
  }
}
