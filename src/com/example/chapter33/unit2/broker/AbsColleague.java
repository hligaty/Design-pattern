package com.example.chapter33.unit2.broker;

/**
 * 抽象同事类
 */
public abstract class AbsColleague {
  protected AbsMediator mediator;

  public AbsColleague(AbsMediator mediator) {
    this.mediator = mediator;
  }
}
