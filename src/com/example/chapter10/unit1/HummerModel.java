package com.example.chapter10.unit1;

public abstract class HummerModel {
  /**
   * 开
   */
  public abstract void start();

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
    this.start();
    if (isAlarm()) {
      this.alarm();
    }
    this.engineBoom();
    this.stop();
  }

  boolean isAlarm() {
    return true;
  }
}
