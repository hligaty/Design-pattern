package com.example.chapter31.unit1.proxy;

import java.util.Random;

public class RunnerProxy implements IRunner {
  private IRunner runner;

  public RunnerProxy(IRunner runner) {
    this.runner = runner;
  }

  @Override
  public void run() {
    Random random = new Random();
    if (random.nextBoolean()) {
      this.runner.run();
    } else {
      System.out.println("代理人不安排跑步");
    }
  }
}
