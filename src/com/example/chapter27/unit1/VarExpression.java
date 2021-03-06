package com.example.chapter27.unit1;

import java.util.Map;

/**
 * 变量解析器
 */
public class VarExpression extends Expression {
  private String key;

  public VarExpression(String key) {
    this.key = key;
  }

  @Override
  public int interpreter(Map<String, Integer> var) {
    return var.get(this.key);
  }
}
