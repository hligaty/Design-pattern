package com.example.chapter33.unit3.bridge;

/**
 * 歌星
 */
public class Singer extends AbsStar {
  public Singer() {
    super(new Sing());
  }

  public Singer(AbsAction action) {
    super(action);
  }

  @Override
  public void doJob() {
    System.out.println("===歌星===");
    super.doJob();
  }
}
