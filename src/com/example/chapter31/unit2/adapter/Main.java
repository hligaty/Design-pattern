package com.example.chapter31.unit2.adapter;

public class Main {
  public static void main(String[] args) {
    /**
     * 适配器模式
     */
    System.out.println("===妈妈有五个孩子，其中四个模样是这样的：===");
    Duck duck = new Duckling();
    duck.cry();
    duck.desAppearance();
    duck.desBehavior();
    System.out.println("\n===一只独特的小鸭子，模样是这样的：===");
    Duck uglyDuckling = new UglyDuckling();
    uglyDuckling.cry();
    uglyDuckling.desAppearance();
    uglyDuckling.desBehavior();
  }
}
