package com.example.chapter33.unit3.decorative;

public abstract class Decorator implements IStar{
  private IStar star;

  public Decorator(IStar star) {
    this.star = star;
  }

  @Override
  public void act() {
    this.star.act();
  }
}
