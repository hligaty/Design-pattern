package com.example.chapter12.unit2;

public class GamePlayer implements IGamePlayer {
  private String name;
  private IGamePlayer proxy;

  public GamePlayer(String name) {
    this.name = name;
  }

  @Override
  public void login(String username, String password) {
    if (this.proxy != null) {
      System.out.println(name + "登录成功");
    } else {
      System.out.println("请使用指定的代理访问");
    }
  }

  @Override
  public void killBoss() {
    if (this.proxy != null) {
      System.out.println(name + "在打怪");
    } else {
      System.out.println("请使用指定的代理访问");
    }
  }

  @Override
  public void upgrade() {
    if (this.proxy != null) {
      System.out.println(name + "升级成功");
    } else {
      System.out.println("请使用指定的代理访问");
    }
  }

  @Override
  public IGamePlayer getProxy() {
    this.proxy = new GamePlayerProxy(this);
    return this.proxy;
  }
}
