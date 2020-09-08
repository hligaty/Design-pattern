package com.example.chapter25.unit2.oubledispatch;


/**
 * 笨蛋角色
 */
public class IdiotRole implements Role {

  @Override
  public void accept(AbsActor actor) {
    actor.act(this);
  }
}
