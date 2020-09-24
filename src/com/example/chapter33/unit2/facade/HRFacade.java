package com.example.chapter33.unit2.facade;

import java.util.Date;

public class HRFacade {
  // 总工资情况
  private SalaryProvider salaryProvider = new SalaryProvider();
  // 考勤情况
  private Attendance attendance = new Attendance();

  // 查询一个人的总收入
  public int querySalary(String name, Date date) {
    return salaryProvider.totalSalary();
  }

  // 查询一个员工一个月工作了多少天
  public int queryWorkDays(String name) {
    return attendance.getWorkDays();
  }
}
