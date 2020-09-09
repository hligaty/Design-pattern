package com.example.chapter29.unit1;

public class House extends Product {
  @Override
  protected void beProduct() {
    System.out.println("盖房子");
  }

  @Override
  protected void beSelled() {
    System.out.println("卖房子");
  }
}
