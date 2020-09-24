package com.example.chapter32.unit2.state;

import static com.example.chapter32.unit2.state.Human.CHIILD_STATE;

public class Main {
  public static void main(String[] args) {
    /**
     * 命令模式
     */
    Human human = new Human();
    human.setState(CHIILD_STATE);
    human.work();
    human.work();
    human.work();
  }
}
