package com.example.chapter15.unit1;

public abstract class Command {
  Group group;

  public Command(Group group) {
    this.group = group;
  }

  public abstract void execute();
}
