package com.example.chapter9.unit1;

public class Main {
  public static void main(String[] args) {
    /**
     * 抽象方法模式
     * 定义：为创建一组相关或相互依赖的对象提供一个接口，而且无须指定它们的具体类。
     */
    HumanFactory maleHumanFactory = new MaleHumanFactory();
    HumanFactory feMaleHumanFactory = new FemaleHumanFactory();

    Human blackMaleHuman = maleHumanFactory.createBlackHuman();
    blackMaleHuman.getSex();
    Human whiteMaleHuman = maleHumanFactory.createWhiteHuman();
    whiteMaleHuman.getSex();
    Human yellowMaleHuman = maleHumanFactory.createYellowHuman();
    yellowMaleHuman.getSex();

    Human blackFemaleHuman = feMaleHumanFactory.createBlackHuman();
    blackFemaleHuman.getSex();
    Human whiteFemaleHuman = feMaleHumanFactory.createWhiteHuman();
    whiteFemaleHuman.getSex();
    Human yellowFemaleHuman = feMaleHumanFactory.createYellowHuman();
    yellowFemaleHuman.getSex();
  }
}
