package com.example.chapter29.unit1;

public class RealtyCorp extends Corp {
  public RealtyCorp(Product product) {
    super(product);
  }

  @Override
  public void makeMoney() {
    super.makeMoney();
    System.out.println("房地产赚大钱");
  }
}
