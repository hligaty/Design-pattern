package com.example.chapter25.unit1;

public class CommonEmployee extends Employee {
  private String job;

  public String getJob() {
    return job;
  }

  public void setJob(String job) {
    this.job = job;
  }

  @Override
  protected void accept(IVisitor visitor) {
    visitor.visit(this);
  }
}
