package com.example.chapter33.unit3.decorative;

public class Hard extends Decorator {
  public Hard(IStar star) {
    super(star);
  }

  @Override
  public void act() {
    super.act();
    System.out.println("演后：好辛苦（其实就站了 10 分钟）");
  }
}
