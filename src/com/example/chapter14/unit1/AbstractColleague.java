package com.example.chapter14.unit1;

/**
 * 抽象同事
 */
public abstract class AbstractColleague {
  AbstractMediator mediator;

  public AbstractColleague(AbstractMediator mediator) {
    this.mediator = mediator;
  }
}
