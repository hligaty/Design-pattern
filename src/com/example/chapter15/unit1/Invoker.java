package com.example.chapter15.unit1;

/**
 * 负责人
 */
public class Invoker {
  private Command command;

  public void setCommand(Command command) {
    this.command = command;
  }

  public void action() {
    this.command.execute();
  }
}
