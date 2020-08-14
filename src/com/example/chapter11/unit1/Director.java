package com.example.chapter11.unit1;

import java.util.ArrayList;

import static com.example.chapter11.unit1.Work.*;

/**
 * @author gaodapeng
 */
public class Director {
  private ArrayList<Work> sequence = new ArrayList<>();
  private BenzBuilder benzBuilder = new BenzBuilder();
  private BMWBuilder bmwBuilder = new BMWBuilder();

  public BenzModel getBenzAModel() {
    this.sequence.clear();
    sequence.add(START);
    sequence.add(STOP);
    benzBuilder.setSequence(sequence);
    return (BenzModel) this.benzBuilder.getCarModel();
  }

  public BenzModel getBenzBModel() {
    this.sequence.clear();
    sequence.add(ENGINE);
    sequence.add(START);
    sequence.add(STOP);
    benzBuilder.setSequence(sequence);
    return (BenzModel) this.benzBuilder.getCarModel();
  }

  public BMWModel getBMWCModel() {
    this.sequence.clear();
    sequence.add(ALARM);
    sequence.add(START);
    sequence.add(STOP);
    bmwBuilder.setSequence(sequence);
    return (BMWModel) this.bmwBuilder.getCarModel();
  }

  public BMWModel getBMWDModel() {
    this.sequence.clear();
    sequence.add(START);
    bmwBuilder.setSequence(sequence);
    return (BMWModel) this.bmwBuilder.getCarModel();
  }
}
