package com.example.chapter30.unit1.builder;

public class Main {
  public static void main(String[] args) {
    /**
     * 建造者模式
     * 意图不同：依赖各个部件的产生以及装配顺序，它关注的是“由零件一步一步地组装出产品对象”。
     * 产品的复杂度不同：建造者模式创建的是一个复合产品，它由各个部件复合而成，部件不同产品对象当然不同。
     */
    SuperMan adultSuperMan = Director.getAdultSuperMan();
    System.out.println(adultSuperMan.getSpecialTalent());
  }
}
