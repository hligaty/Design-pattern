package com.example.chapter27.unit1;

/**
 * 符号解析器
 */
public abstract class SymbolExpression extends Expression {
  protected Expression left;
  protected Expression right;

  public SymbolExpression(Expression left, Expression right) {
    this.left = left;
    this.right = right;
  }
}
