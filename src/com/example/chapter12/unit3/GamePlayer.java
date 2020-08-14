package com.example.chapter12.unit3;

public class GamePlayer implements IGamePlayer {
  private String name;

  public GamePlayer(String name) throws Exception {

    this.name = name;
  }

  @Override
  public void login(String username, String password) {
    System.out.println(name + "登录成功");
  }

  @Override
  public void killBoss() {
    System.out.println(name + "在打怪");
  }

  @Override
  public void upgrade() {
    System.out.println(name + "升级成功");
  }
}
