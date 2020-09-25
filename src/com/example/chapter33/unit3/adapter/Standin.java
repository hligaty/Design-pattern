package com.example.chapter33.unit3.adapter;

/**
 * 替身演员
 */
public class Standin implements IStar {
  private IActor actor;

  public Standin(IActor actor) {
    this.actor = actor;
  }

  @Override
  public void act(String context) {
    actor.playact(context);
  }
}
