package com.example.chapter25.unit1;

public class ShowVisitor implements IShowVisitor {
  private String info = "";

  @Override
  public void report() {
    System.out.println(this.info);
  }

  @Override
  public void visit(CommonEmployee commonEmployee) {
    this.info += "\n" + this.getCommonEmployeeInfo(commonEmployee);
  }

  @Override
  public void visit(Manager manager) {
    this.info += "\n" + this.getManagerInfo(manager);
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
