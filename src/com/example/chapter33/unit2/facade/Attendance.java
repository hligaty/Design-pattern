package com.example.chapter33.unit2.facade;

import java.util.Random;

public class Attendance {
  /**
   * 得到出勤天数
   */
  public int getWorkDays() {
    return (new Random()).nextInt(30);
  }
}
