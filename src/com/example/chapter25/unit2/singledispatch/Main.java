package com.example.chapter25.unit2.singledispatch;

public class Main {
  public static void main(String[] args) {
    /**
     * 单反派，java重载是静态绑定的，在编译器就知道调用什么方法
     */
    AbsActor actor = new OldActor();
    Role role = new KungFuRole();

    actor.act(role);
    actor.act(new KungFuRole());
  }
}
