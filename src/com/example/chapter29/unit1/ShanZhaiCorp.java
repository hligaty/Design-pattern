package com.example.chapter29.unit1;

public class ShanZhaiCorp extends Corp {
  public ShanZhaiCorp(Product product) {
    super(product);
  }

  @Override
  public void makeMoney() {
    super.makeMoney();
    System.out.println("什么都赚");
  }
}
