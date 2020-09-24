package com.example.chapter32.unit2.state;

public abstract class HumanState {
  protected Human human;

  public void setHuman(Human human) {
    this.human = human;
  }

  abstract public void work();
}
