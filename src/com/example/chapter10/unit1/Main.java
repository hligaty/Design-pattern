package com.example.chapter10.unit1;

public class Main {

  public static void main(String[] args) {
    /**
     * 模板方法模式
     * 定义：定义一个操作中的算法的框架，而将一些步骤延迟到子类中。使得子类可以不改变一个算法的结构即可重定义该算法的某些特定步骤。
     */
    HummerH1Model h1 = new HummerH1Model();
    HummerH2Model h2 = new HummerH2Model();

    //可以h1不按喇叭
    h1.setAlarmFlag(false);
    h1.run();
    //默认h2不按喇叭
    h2.run();
  }
}
