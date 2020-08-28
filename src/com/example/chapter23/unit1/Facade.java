package com.example.chapter23.unit1;

public class Facade {
  private ClassA classA = new ClassA();
  private ClassB classB = new ClassB();
  private ClassC classC = new ClassC();
  private Context context = new Context();

  public void methodA() {
    classA.doSomethingA();
  }

  public void methodB() {
    classB.doSomethingB();
  }

  public void methodC() {
    classC.doSomethingC();
  }

  public void complexMethod() {
    context.complexMethod();
  }
}
