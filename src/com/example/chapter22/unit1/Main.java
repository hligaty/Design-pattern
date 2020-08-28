package com.example.chapter22.unit1;

public class Main {
  public static void main(String[] args) {
    /**
     * 观察者模式
     * 定义：定义对象间一种一对多的依赖关系，使得每当一个对象改变状态，则所有依赖于它的对象都会得到通知并被自动更新。
     * 发布-订阅模式与它没本质区别，只多了一个broker，增加了一些处理，并且将被观察者和观察者彻底分开了
     */
    HanFeiZhi hanFeiZhi = new HanFeiZhi();
    hanFeiZhi.addObserver(new Lishi());
    hanFeiZhi.addObserver(new Liushi());

    hanFeiZhi.haveBreakfast();
    hanFeiZhi.haveFun();
  }
}
