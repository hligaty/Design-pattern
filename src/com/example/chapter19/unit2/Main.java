package com.example.chapter19.unit2;

public class Main {
  public static void main(String[] args) {
    /**
     * 适配器模式
     * 使用关联关系（组合？）解决适配时的多继承问题
     */
    IOuterUserBaseInfo baseInfo = new OuterUserBaseInfo();
    IOuterUserOfficeInfo officeInfo = new OuterUserOfficeInfo();
    IOuterUserHomeInfo homeInfo = new OuterUserHomeInfo();

    IUserInfo youngGirl = new OuterUserInfo(baseInfo, homeInfo, officeInfo);
    for (int i = 0; i < 3; i++) {
      System.out.println(youngGirl.getMobileNumber());
    }
  }
}
