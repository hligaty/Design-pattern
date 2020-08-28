package com.example.chapter23.unit1;

public class Context {
  private ClassA classA = new ClassA();
  private ClassB classB = new ClassB();

  public void complexMethod() {
    this.classA.doSomethingA();
    this.classB.doSomethingB();
  }
}
