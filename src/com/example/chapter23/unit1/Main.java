package com.example.chapter23.unit1;

public class Main {
  public static void main(String[] args) {
    /**
     * 门面模式
     * 定义：要求一个子系统的外部与其内部的通信必须通过一个统一的对象进行。门面模式提供一个高层次的接口，使得子系统更易于使用。
     * 需要只提供某些方法的门面可以基于原来的门面增加一层抽象。门面的方法太多可以按条件（比如crud）分成多个门面
     */
    Facade facade = new Facade();
    facade.methodA();
    facade.methodB();
    facade.methodC();
    facade.complexMethod();
  }
}
