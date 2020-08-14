package com.example.chapter12.unit2;

public class GamePlayerProxy implements IGamePlayer, IProxy {
  private IGamePlayer player;

  public GamePlayerProxy(IGamePlayer player) {
    this.player = player;
  }

  @Override
  public void login(String username, String password) {
    this.player.login(username, password);
  }

  @Override
  public void killBoss() {
    this.player.killBoss();
  }

  @Override
  public void upgrade() {
    this.player.upgrade();
    this.count();
  }

  @Override
  public IGamePlayer getProxy() {
    return this;
  }

  @Override
  public void count() {
    System.out.println("升级总费用是150元");
  }
}
