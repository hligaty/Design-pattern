package com.example.chapter33.unit2.facade;

import java.util.Random;

public class Performance {
  // 基本工资
  private BasicSalary basicSalary = new BasicSalary();

  public int getPerformanceValue() {
    // 随机绩效
    int perf = (new Random()).nextInt(100);
    return basicSalary.getBasicSalary() * perf / 100;
  }
}
