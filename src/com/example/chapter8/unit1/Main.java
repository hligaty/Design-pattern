package com.example.chapter8.unit1;

public class Main {

  public static void main(String[] args) {
    /*
    工厂方法模式
    定义：定义一个用于创建对象的接口，让子类决定实例化哪一个类。工厂方法使一个类的实例化延迟到其子类。
     */
    AbstractHumanFactory humanFactory = new HumanFactory();
    Human blackHuman = humanFactory.createHuman(BlackHuman.class);
    Human whiteHuman = humanFactory.createHuman(WhiteHuman.class);
    Human yellowHuman = humanFactory.createHuman(YellowHuman.class);

    whiteHuman.getColor();
    whiteHuman.talk();

    blackHuman.getColor();
    blackHuman.talk();

    yellowHuman.getColor();
    yellowHuman.talk();
  }
}
