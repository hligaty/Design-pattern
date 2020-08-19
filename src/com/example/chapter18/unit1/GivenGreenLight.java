package com.example.chapter18.unit1;

public class GivenGreenLight implements IStrategy {
  @Override
  public void operate() {
    System.out.println("吴国太开绿灯");
  }
}
