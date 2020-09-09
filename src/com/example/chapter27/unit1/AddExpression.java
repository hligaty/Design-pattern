package com.example.chapter27.unit1;

import java.util.Map;

public class AddExpression extends SymbolExpression {
  public AddExpression(Expression left, Expression right) {
    super(left, right);
  }

  @Override
  public int interpreter(Map<String, Integer> var) {
    return super.left.interpreter(var) + super.right.interpreter(var);
  }
}
