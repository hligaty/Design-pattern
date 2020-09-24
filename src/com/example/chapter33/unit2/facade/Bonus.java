package com.example.chapter33.unit2.facade;

public class Bonus {
  /**
   * 考勤情况
   */
  private Attendance attendance = new Attendance();

  /**
   * 奖金
   */
  public int getBonus() {
    // 获得出勤天数
    int workDays = attendance.getWorkDays();
    // 奖金计算模型
    int bonus = workDays * 1800 / 30;
    return bonus;
  }
}
