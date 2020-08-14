package com.example.chapter9.unit1;

public abstract class AbstractYellowHuman implements Human {
  @Override
  public void getColor() {
    System.out.println("yellow man");
  }

  @Override
  public void talk() {
    System.out.println("yellow talk");
  }
}
