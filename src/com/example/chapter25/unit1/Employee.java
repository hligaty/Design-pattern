package com.example.chapter25.unit1;

public abstract class Employee {
  //男性
  public final static int MALE = 0;
  //女性
  public final static int FEMALE = 1;
  private String name;
  private int salary;
  private int sex;

  public int getSex() {
    return sex;
  }

  public void setSex(int sex) {
    this.sex = sex;
  }

  public int getSalary() {
    return salary;
  }

  public void setSalary(int salary) {
    this.salary = salary;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
  protected abstract void accept(IVisitor visitor);
}
