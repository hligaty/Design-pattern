package com.example.chapter11.unit1;

import java.util.ArrayList;

public abstract class CarModel {

  private ArrayList<Work> sequence = new ArrayList<>(5);

  /**
   * 停
   */
  public abstract void stop();

  /**
   * 喇叭
   */
  public abstract void alarm();

  /**
   * 引擎轰鸣声
   */
  public abstract void engineBoom();

  public void run() {
    sequence.stream()
            .forEach(work -> {
              switch (work) {
                case START:
                  this.start();
                  break;
                case STOP:
                  this.stop();
                  break;
                case ALARM:
                  this.alarm();
                  break;
                case ENGINE:
                  this.engineBoom();
                  break;
              }
            });
  }

  final public void setSequence(ArrayList<Work> sequence) {
    this.sequence = sequence;
  }

  /**
   * 开
   */
  public abstract void start();
}
