package com.example.chapter12.unit2;

public class Main {
  public static void main(String[] args) {
    /*
    代理模式，强制代理
    定义：为其他对象提供一种代理以控制这个对象的访问
    不允许直接访问真实角色，使用代理角色访问，并且代理角色的管理由自身解决
     */
    IGamePlayer player = new GamePlayer("张三");
    IGamePlayer proxy = player.getProxy();
    proxy.login("zhangshan", "password");
    proxy.killBoss();
    proxy.upgrade();
  }
}
