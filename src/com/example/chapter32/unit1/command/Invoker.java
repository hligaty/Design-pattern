package com.example.chapter32.unit1.command;

public class Invoker {
  private AbstractCmd cmd;

  public Invoker(AbstractCmd cmd) {
    this.cmd = cmd;
  }

  public boolean execute(String source, String to) {
    return this.cmd.execute(source, to);
  }
}
