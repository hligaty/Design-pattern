package com.example.chapter25.unit2.oubledispatch;

public abstract class AbsActor {
  public void act(IdiotRole role) {
    System.out.println("演员可以扮演笨蛋角色");
  }

  public void act(KungFuRole role) {
    System.out.println("演员都可以演功夫角色");
  }
}
