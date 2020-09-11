package com.example.chapter31.unit2.decorative;

public class Decorator implements Swan {
  private Swan swan;

  public Decorator(Swan swan) {
    this.swan = swan;
  }

  @Override
  public void fly() {
    this.swan.fly();
  }

  @Override
  public void cry() {
this.swan.cry();
  }

  @Override
  public void desAppaearance() {
this.swan.desAppaearance();
  }
}
