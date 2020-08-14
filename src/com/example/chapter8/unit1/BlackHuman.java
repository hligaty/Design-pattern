package com.example.chapter8.unit1;

public class BlackHuman implements Human {

  @Override
  public void getColor() {
    System.out.println("黑色人种皮肤是黑色的");
  }

  @Override
  public void talk() {
    System.out.println("黑人会说话，但听不懂");
  }
}
