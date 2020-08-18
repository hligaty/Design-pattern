package com.example.chapter17.unit1;

public class FouthGradeSchoolReport extends SchoolReport {
  @Override
  public void report() {
    System.out.println("语文62");
  }

  @Override
  public void sign(String name) {
    System.out.println("签字:" + name);
  }
}
