package com.example.chapter17.unit1;

public class Decorator extends SchoolReport {
  private SchoolReport report;

  public Decorator(SchoolReport report) {
    this.report = report;
  }

  @Override
  public void report() {
    this.report.report();
  }

  @Override
  public void sign(String name) {
    this.report.sign(name);
  }
}
