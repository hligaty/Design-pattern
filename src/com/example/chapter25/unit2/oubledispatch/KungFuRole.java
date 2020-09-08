package com.example.chapter25.unit2.oubledispatch;


/**
 * 功夫角色
 */
public class KungFuRole implements Role {

  @Override
  public void accept(AbsActor actor) {
    actor.act(this);
  }
}
