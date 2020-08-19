package com.example.chapter18.unit2;

public enum Calculator {
  /**
   * 加法
   */
  ADD("+") {
    @Override
    public int exec(int a, int b) {
      return a + b;
    }
  },
  /**
   * 减法
   */
  SUB("-") {
    @Override
    public int exec(int a, int b) {
      return a - b;
    }
  };

  private String value;

  Calculator(String value) {
    this.value = value;
  }

  public abstract int exec(int a, int b);
}
