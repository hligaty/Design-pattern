package com.example.chapter18.unit1;

public class Main {
  public static void main(String[] args) {
    /**
     * 策略模式
     * 定义：定义一组算法，将每个算法都封装起来，并且使它们之间可以互换。
     * 和代理模式的区别只是封装和被封装的类是不是实现了同一个接口
     */
    Context context;
    context = new Context(new BackDoor());
    context.operate();

    context = new Context(new GivenGreenLight());
    context.operate();

    context = new Context(new BlockEnemy());
    context.operate();
  }
}
