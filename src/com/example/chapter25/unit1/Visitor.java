package com.example.chapter25.unit1;

public class Visitor implements IVisitor {
  @Override
  public void visit(CommonEmployee commonEmployee) {
    System.out.println(this.getCommonEmployeeInfo(commonEmployee));
  }

  @Override
  public void visit(Manager manager) {
    System.out.println(this.getManagerInfo(manager));
  }

  public String getBasicInfo(Employee employee) {
    String info = "姓名:" + employee.getName() + "\t";
    info += "性别:" + (employee.getSex() == Employee.MALE ? "男" : "女") + "\t";
    info += "工资:" + employee.getSalary() + "\t";
    return info;
  }

  public String getManagerInfo(Manager manager) {
    String info = this.getBasicInfo(manager);
    info += "业绩:" + manager.getPerformance() + "\t";
    return info;
  }

  public String getCommonEmployeeInfo(CommonEmployee commonEmployee) {
    String info = this.getBasicInfo(commonEmployee);
    info += "工作:" + commonEmployee.getJob() + "\t";
    return info;
  }
}
