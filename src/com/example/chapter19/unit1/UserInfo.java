package com.example.chapter19.unit1;

public class UserInfo implements IUserInfo {
  @Override
  public String getUserName() {
    return "员工姓名";
  }

  @Override
  public String getHomeAddress() {
    return "员工地址";
  }

  @Override
  public String getMobileNumber() {
    return "员工移动电话";
  }

  @Override
  public String getOfficeTelNumber() {
    return "员工办公电话";
  }

  @Override
  public String getJobPosition() {
    return "员工职位";
  }

  @Override
  public String getHomeTelNumber() {
    return "员工家庭电话";
  }
}
