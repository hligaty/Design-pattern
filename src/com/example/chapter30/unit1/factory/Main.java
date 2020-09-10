package com.example.chapter30.unit1.factory;

public class Main {
  public static void main(String[] args) {
    /**
     * 工厂模式
     * 意图不同：关注的是一个产品整体，无须关心产品的各部分是如何创建出来的.
     * 产品的复杂度不同：工厂方法模式创建的产品一般都是单一性质产品，都是一个模样
     */
    ISuperMan adultSuperMan = SuperManFactory.createSuperMan("adult");
    adultSuperMan.specialTalent();
  }
}
