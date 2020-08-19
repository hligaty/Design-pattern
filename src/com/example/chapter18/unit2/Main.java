package com.example.chapter18.unit2;

public class Main {
  public static void main(String[] args) {
    /**
     * 策略模式，策略枚举
     * 适合不变的策略
     */
    System.out.println(Calculator.ADD.exec(1, 2));

    System.out.println(Calculator.SUB.exec(1, 2));
  }
}
