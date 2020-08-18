package com.example.chapter15.unit1;

/**
 * 代码组
 */
public class CodeGroup extends Group {
  @Override
  public void find() {
    System.out.println("find code group");
  }

  @Override
  public void add() {
    System.out.println("add code");
  }

  @Override
  public void delete() {
    System.out.println("delete code");
  }

  @Override
  public void change() {
    System.out.println("change code");
  }

  @Override
  public void plan() {
    System.out.println("plan code");
  }
}
