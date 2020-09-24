package com.example.chapter32.unit2.state;

public class ChildState extends HumanState {
  @Override
  public void work() {
    System.out.println("儿童的工作是玩耍！");
    super.human.setState(Human.ADULT_STATE);
  }
}
