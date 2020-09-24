package com.example.chapter32.unit2.strategy;

public class Context {
  private WorkAlgorithm workAlgorithm;

  public WorkAlgorithm getWorkAlgorithm() {
    return workAlgorithm;
  }

  public void setWorkAlgorithm(WorkAlgorithm workAlgorithm) {
    this.workAlgorithm = workAlgorithm;
  }

  public void work() {
    this.workAlgorithm.work();
  }
}
