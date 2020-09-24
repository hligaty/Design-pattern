package com.example.chapter33.unit2.broker;

public class Tax extends AbsColleague implements ITax {
  public Tax(AbsMediator mediator) {
    super(mediator);
  }

  @Override
  public void raise() {
    super.mediator.up(this);
  }

  @Override
  public void drop() {
    super.mediator.down(this);
  }
}
