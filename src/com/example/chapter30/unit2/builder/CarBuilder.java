package com.example.chapter30.unit2.builder;

/**
 * 抽象建造者
 */
public abstract class CarBuilder {
  private ICar car;
  private Blueprint blueprint;

  /**
   * 创建汽车
   */
  public Car buildCar() {
    return new Car(buildEngine(), buildWheel());
  }

  /**
   * 建造车轮
   */
  protected abstract String buildWheel();

  /**
   * 建造引擎
   */
  protected abstract String buildEngine();

  /**
   * 接收一份设计图
   */
  public void receiveBlueprint(Blueprint blueprint) {
    this.blueprint = blueprint;
  }

  /**
   * 获取设计图（只有真正的建造者才可以看）
   */
  protected Blueprint getBlueprint() {
    return this.blueprint;
  }

  
}
