package com.example.chapter30.unit2.builder;

/**
 * 导演类
 */
public class Director {
  private CarBuilder benzBuilder = new BenzBuilder();
  private CarBuilder bmwBuilder = new BMWBuilder();

  /**
   * 生产奔驰SUV
   */
  public ICar createBenzSuv() {
    return createCar(benzBuilder, "benz的引擎", "benz的轮胎");
  }

  /**
   * 生产宝马商务车
   */
  public ICar createBMWVan() {
    return createCar(benzBuilder, "BMW的引擎", "BMW的轮胎");
  }

  /**
   * 生产混合车型
   */
  public ICar createComplexCar() {
    return createCar(bmwBuilder, "BMW的引擎", "benz的轮胎");
  }

  private ICar createCar(CarBuilder carBuilder, String engine, String wheel) {
    Blueprint blueprint = new Blueprint();
    blueprint.setEngine(engine);
    blueprint.setWheel(wheel);
    carBuilder.receiveBlueprint(blueprint);
    return carBuilder.buildCar();
  }
}