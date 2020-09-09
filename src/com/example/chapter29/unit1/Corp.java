package com.example.chapter29.unit1;

public abstract class Corp {
  private Product product;

  public Corp(Product product) {
    this.product = product;
  }

  public void makeMoney() {
    this.product.beProduct();
    this.product.beSelled();
  }
}
