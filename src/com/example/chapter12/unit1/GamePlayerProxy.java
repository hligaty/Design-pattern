package com.example.chapter12.unit1;

public class GamePlayerProxy implements IGamePlayer {
  private IGamePlayer iGamePlayer;

  public GamePlayerProxy(String name) {
    try {
      iGamePlayer = new GamePlayer(this, name);
    } catch (Exception e) {
      System.out.println("没创建了角色");
    }
  }

  @Override
  public void login(String username, String password) {
    this.iGamePlayer.login(username, password);
  }

  @Override
  public void killBoss() {
    this.iGamePlayer.killBoss();
  }

  @Override
  public void upgrade() {
    this.iGamePlayer.upgrade();
  }
}
