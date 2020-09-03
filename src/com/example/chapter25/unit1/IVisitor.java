package com.example.chapter25.unit1;

public interface IVisitor {
  void visit(CommonEmployee commonEmployee);

  void visit(Manager manager);
}
