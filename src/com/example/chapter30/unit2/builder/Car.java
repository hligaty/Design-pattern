package com.example.chapter30.unit2.builder;

public class Car implements ICar {
  /**
   * 引擎
   */
  private String engine;
  /**
   * 引擎
   */
  private String wheel;

  public Car(String engine, String wheel) {
    this.engine = engine;
    this.wheel = wheel;
  }

  @Override
  public String getWheel() {
    return this.wheel;
  }

  @Override
  public String getEngine() {
    return this.engine;
  }

  @Override
  public String toString() {
    return "Car{" +
            "engine='" + engine + '\'' +
            ", wheel='" + wheel + '\'' +
            '}';
  }
}
