package com.example.chapter12.unit1;

public interface IGamePlayer {

  /**
   * 登录游戏
   *
   * @param username
   * @param password
   */
  public void login(String username, String password);

  /**
   * 杀怪
   */
  public void killBoss();

  /**
   * 升级
   */
  public void upgrade();
}
