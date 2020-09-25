package com.example.chapter33.unit3.bridge;

/**
 * 抽象明星
 */
public abstract class AbsStar {
  protected final AbsAction action;

  public AbsStar(AbsAction action) {
    this.action = action;
  }

  /**
   * 做自己的工作
   */
  public void doJob() {
    action.desc();
  }
}
