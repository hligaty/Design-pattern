package com.example.chapter12.unit1;

public class Main {
  public static void main(String[] args) {
    /*
    代理模式，普通代理
    定义：为其他对象提供一种代理以控制这个对象的访问
    屏蔽底层对高层的影响，真实角色可以随意修改
     */
    IGamePlayer proxy = new GamePlayerProxy("张三");
    proxy.login("zhangshan", "password");
    proxy.killBoss();
    proxy.upgrade();
  }
}
