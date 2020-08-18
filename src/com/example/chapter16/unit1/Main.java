package com.example.chapter16.unit1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
  public static void main(String[] args) {
    /**
     * 责任链模式
     * 定义：使多个对象都有机会处理请求，从而避免了请求的发送者和接受者之间的耦合关系。将这些对象连成一条链，并沿着这条链传递该请求，直到有对象处理它为止。
     * 注意：链太长，性能问题。调试费劲
     */
    Random random = new Random();
    List<IWomen> list = new ArrayList<>();
    for (int i = 0; i < 5; i++) {
      list.add(new Women(random.nextInt(4), "逛街(gai)"));
    }
    Handler father = new Father();
    Handler husband = new Husband();
    Handler son = new Son();
    father.setNext(husband);
    husband.setNext(son);

    for (IWomen women : list) {
      father.handlerMessage(women);
    }
  }
}
