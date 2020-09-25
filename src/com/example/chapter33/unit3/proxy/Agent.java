package com.example.chapter33.unit3.proxy;

public class Agent implements IStar {
  private IStar star;

  public Agent(IStar star) {
    this.star = star;
  }

  @Override
  public void sign() {
    star.sign();
  }
}
