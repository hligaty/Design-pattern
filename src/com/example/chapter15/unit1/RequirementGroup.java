package com.example.chapter15.unit1;

/**
 * 需求组
 */
public class RequirementGroup extends Group {
  @Override
  public void find() {
    System.out.println("fing requirement group");
  }

  @Override
  public void add() {
    System.out.println("add reuqire");
  }

  @Override
  public void delete() {
    System.out.println("delete reuqire");
  }

  @Override
  public void change() {
    System.out.println("change reuqire");
  }

  @Override
  public void plan() {
    System.out.println("plan reuqire");
  }
}
