package com.example.chapter31.unit2.decorative;

public class BeautifyAppearance extends Decorator {
  public BeautifyAppearance(Swan swan) {
    super(swan);
  }

  /**
   * 外表美化处理
   */
  @Override
  public void desAppaearance() {
    System.out.println("外表是纯白色的，非常惹人喜爱！");
  }
}
