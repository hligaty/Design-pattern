package com.example.chapter8.unit1;

public class WhiteHuman implements Human {
  @Override
  public void getColor() {
    System.out.println("白色人种皮肤是白色的");
  }

  @Override
  public void talk() {
    System.out.println("白色人种一般说英语");
  }
}
