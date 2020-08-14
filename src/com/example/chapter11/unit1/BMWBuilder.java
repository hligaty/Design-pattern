package com.example.chapter11.unit1;

import java.util.ArrayList;

/**
 * @author gaodapeng
 */
public class BMWBuilder extends CarBuilder {

  private BMWModel bmw = new BMWModel();

  @Override
  public void setSequence(ArrayList<Work> sequence) {
    this.bmw.setSequence(sequence);
  }

  @Override
  public CarModel getCarModel() {
    return this.bmw;
  }
}
