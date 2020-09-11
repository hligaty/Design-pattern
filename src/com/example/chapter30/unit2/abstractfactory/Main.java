package com.example.chapter30.unit2.abstractfactory;

public class Main {
  public static void main(String[] args) {
    /**
     * 抽下工厂模式
     * 使用“工厂”来描述构建者,不用关心具体怎么生产。
     */
    CarFactory carFactory = new BenzFactory();
    ICar benzSuv = carFactory.createSuv();
    System.out.println("汽车品牌:" + benzSuv.getBand());
    System.out.println("汽车型号:" + benzSuv.getModel());
  }
}
