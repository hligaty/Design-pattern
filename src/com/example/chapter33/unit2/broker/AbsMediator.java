package com.example.chapter33.unit2.broker;

public abstract class AbsMediator {
  //工资
  protected ISalary salary;
  // 职位
  protected IPosition position;
  // 税收
  protected ITax tax;

  //工资增加了

  public abstract void up(ISalary salary);
  //职位提升了
  public abstract void up(IPosition position);
  //税收增加了
  public abstract void up(ITax tax);
  //工资降低了
  public abstract void down(ISalary salary);
  //职位降低了
  public abstract void down(IPosition position);
  //税收降低了
  public abstract void down(ITax tax);

  public void setSalary(ISalary salary) {
    this.salary = salary;
  }

  public void setPosition(IPosition position) {
    this.position = position;
  }

  public void setTax(ITax tax) {
    this.tax = tax;
  }
}
