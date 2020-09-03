package com.example.chapter25.unit1;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    IVisitor visitor = new Visitor();
    for (Employee employee : mockEmployee()) {
      employee.accept(visitor);
    }
  }

  private static List<Employee> mockEmployee() {
    List<Employee> employees = new ArrayList<>();
    CommonEmployee zhangShan = new CommonEmployee();
    zhangShan.setName("张三");
    zhangShan.setSex(Employee.MALE);
    zhangShan.setSalary(1800);
    zhangShan.setJob("程序员");
    employees.add(zhangShan);
    Manager liSi = new Manager();
    liSi.setPerformance("业绩贼差");
    liSi.setSex(Employee.FEMALE);
    liSi.setSalary(18750);
    liSi.setName("李四");
    employees.add(liSi);
    return employees;
  }
}
