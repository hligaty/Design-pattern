package com.example.chapter33.unit3.adapter;

/**
 * 普通演员
 */
public class UnknownActor implements IActor {
  @Override
  public void playact(String context) {
    System.out.println("普通演员：" + context);
  }
}