package com.example.chapter11.unit1;

import java.util.ArrayList;

public class BenzBuilder extends CarBuilder {
  private BenzModel benz = new BenzModel();

  @Override
  public void setSequence(ArrayList<Work> sequence) {
    this.benz.setSequence(sequence);
  }

  @Override
  public CarModel getCarModel() {
    return this.benz;
  }
}
