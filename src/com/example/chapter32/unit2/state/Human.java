package com.example.chapter32.unit2.state;

public class Human {
  public static final HumanState CHIILD_STATE = new ChildState();
  public static final HumanState ADULT_STATE = new AdultState();
  public static final HumanState OLD_STATE = new OldState();

  public void setState(HumanState state) {
    this.state = state;
    this.state.setHuman(this);
  }

  private HumanState state;

  public void work() {
    this.state.work();
  }
}
