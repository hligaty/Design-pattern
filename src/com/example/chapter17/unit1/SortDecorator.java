package com.example.chapter17.unit1;

public class SortDecorator extends Decorator {
  public SortDecorator(SchoolReport report) {
    super(report);
  }

  @Override
  public void report() {
    super.report();
    reportSort();
  }

  private void reportSort() {
    System.out.println("排第38名...");
  }
}
