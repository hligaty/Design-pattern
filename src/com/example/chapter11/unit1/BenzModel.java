package com.example.chapter11.unit1;

public class BenzModel extends CarModel {
  @Override
  public void start() {
    System.out.println("benz start");
  }

  @Override
  public void stop() {
    System.out.println("benz stop");
  }

  @Override
  public void alarm() {
    System.out.println("benz alarm");
  }

  @Override
  public void engineBoom() {
    System.out.println("benz engineBoom");
  }
}
