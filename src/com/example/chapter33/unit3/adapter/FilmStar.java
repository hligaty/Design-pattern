package com.example.chapter33.unit3.adapter;

/**
 * 电影明星
 */
public class FilmStar implements IStar {
  @Override
  public void act(String context) {
    System.out.println("明星演戏：" + context);
  }
}
