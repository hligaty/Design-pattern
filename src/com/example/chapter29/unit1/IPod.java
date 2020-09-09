package com.example.chapter29.unit1;

public class IPod extends Product {
  @Override
  protected void beProduct() {
    System.out.println("生产IPod");
  }

  @Override
  protected void beSelled() {
    System.out.println("卖IPod");
  }
}
