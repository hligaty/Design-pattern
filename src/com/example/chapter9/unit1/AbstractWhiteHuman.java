package com.example.chapter9.unit1;

public abstract class AbstractWhiteHuman implements Human {
  @Override
  public void getColor() {
    System.out.println("white man");
  }

  @Override
  public void talk() {
    System.out.println("white talk");
  }
}
