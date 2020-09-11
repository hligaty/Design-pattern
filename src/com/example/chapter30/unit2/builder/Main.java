package com.example.chapter30.unit2.builder;

public class Main {
  public static void main(String[] args) {
    /**
     * 建造者模式
     * 使用“车间”来描述构建者,更关心建造过程。
     */
    Director director = new Director();
    ICar benzSuv = director.createBenzSuv();
    ICar bmwVan = director.createBMWVan();
    ICar complexCar = director.createComplexCar();
    System.out.println(benzSuv);
    System.out.println(bmwVan);
    System.out.println(complexCar);
  }
}
