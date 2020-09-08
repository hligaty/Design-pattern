package com.example.chapter25.unit1;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    /**
     * 访问者模式
     * 定义：封装一些作用于某种数据结构中的各元素的操作，它可以在不改变数据结构的前提下定义作用于这些元素的新的操作。
     * 访问者依赖的是具体元素，而不是抽象元素，这破坏了依赖倒置原则
     * 使用场景：对对象实施一些依赖于其具体类的操作；需要对一个对象结构中的对象进行很多不同并且不相关的操作，而你想避免让这些操作“污染”这些对象的类。
     */
    IShowVisitor showVisitor = new ShowVisitor();
    ITotalVisitor totalVisitor = new TotalVisitor();
    for (Employee employee : mockEmployee()) {
      employee.accept(showVisitor);
      employee.accept(totalVisitor);
    }
    showVisitor.report();
    totalVisitor.totalSalary();
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
