package com.example.chapter17.unit1;

public class Main {
  public static void main(String[] args) {
    /**
     * 装饰模式
     * 定义：动态地给一个对象添加一些额外的职责。
     * 注意：下面的嵌套说明了复杂性，因此要少些装饰。
     */
    SchoolReport report;
    report = new FouthGradeSchoolReport();
    report = new HighScoreDecorator(report);
    report = new SortDecorator(report);
    report.report();
    report.sign("张三");
  }
}
