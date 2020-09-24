package com.example.chapter33.unit2.broker;

public class Salary extends AbsColleague implements ISalary{
  public Salary(AbsMediator mediator) {
    super(mediator);
  }

  @Override
  public void increaseSalary() {
    super.mediator.up(this);
  }

  @Override
  public void decreaseSalary() {
    super.mediator.down(this);
  }
}
