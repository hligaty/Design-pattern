package com.example.chapter9.unit1;

public abstract class AbstractBlackHuman implements Human {
  @Override
  public void getColor() {
    System.out.println("black man");
  }

  @Override
  public void talk() {
    System.out.println("black talk");
  }
}
