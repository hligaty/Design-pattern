package com.example.chapter12.unit1;

public class GamePlayer implements IGamePlayer {
  private String name;

  public GamePlayer(IGamePlayer player, String name) throws Exception {
    if (player == null) {
      throw new Exception("不能创建角色");
    }
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
