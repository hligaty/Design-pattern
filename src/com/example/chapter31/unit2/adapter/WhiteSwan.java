package com.example.chapter31.unit2.adapter;

import com.example.chapter31.unit2.decorative.Swan;

public class WhiteSwan implements Swan {
  @Override
  public void fly() {
    System.out.println("能够飞行");
  }

  @Override
  public void cry() {
    System.out.println("叫声是克噜——克噜——克噜");
  }

  @Override
  public void desAppaearance() {
    System.out.println("外形是纯白色，惹人喜爱");
  }
}
