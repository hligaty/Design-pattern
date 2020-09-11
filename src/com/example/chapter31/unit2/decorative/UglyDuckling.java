package com.example.chapter31.unit2.decorative;

public class UglyDuckling implements Swan {
  @Override
  public void cry() {
    System.out.println("叫声是克噜——克噜——克噜");
  }

  @Override
  public void fly() {
    System.out.println("外形是脏兮兮的白色，毛茸茸的大脑袋");
  }

  @Override
  public void desAppaearance() {
    System.out.println("不能飞行");
  }
}
