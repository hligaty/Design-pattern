package com.example.chapter33.unit3.decorative;

public class HotAir extends Decorator {
  public HotAir(IStar star) {
    super(star);
  }

  @Override
  public void act() {
    System.out.println("演前：我很努力的");
    super.act();
  }
}
