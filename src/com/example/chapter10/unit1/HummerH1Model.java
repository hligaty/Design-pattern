package com.example.chapter10.unit1;

public class HummerH1Model extends HummerModel {

  /**
   * 默认喇叭响
   */
  private boolean alarmFlag = true;

  @Override
  public void start() {
    System.out.println("h1 start");
  }

  @Override
  public void stop() {
    System.out.println("h1 stop");
  }

  @Override
  public void alarm() {
    System.out.println("h1 alarm");
  }

  @Override
  public void engineBoom() {
    System.out.println("h1 engineBoom");
  }

  @Override
  boolean isAlarm() {
    return this.alarmFlag;
  }

  public void setAlarmFlag(boolean alarmFlag) {
    this.alarmFlag = alarmFlag;
  }
}
