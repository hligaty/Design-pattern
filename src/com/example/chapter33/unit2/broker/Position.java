package com.example.chapter33.unit2.broker;

public class Position extends AbsColleague implements IPosition {
  public Position(AbsMediator mediator) {
    super(mediator);
  }

  @Override
  public void promote() {
    super.mediator.up(this);
  }

  @Override
  public void demote() {
    super.mediator.down(this);
  }
}
