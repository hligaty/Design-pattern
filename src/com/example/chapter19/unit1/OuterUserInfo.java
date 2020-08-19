package com.example.chapter19.unit1;

import java.util.Map;

public class OuterUserInfo extends OuterUser implements IUserInfo {
  private Map<String, String> baseInfo = super.getUserBaseInfo();
  private Map<String, String> homeInfo = super.getUserHomeInfo();
  private Map<String, String> officeInfo = super.getUserOfficeInfo();

  @Override
  public String getUserName() {
    return baseInfo.get("username");
  }

  @Override
  public String getHomeAddress() {
    return homeInfo.get("homeAddress");
  }

  @Override
  public String getMobileNumber() {
    return baseInfo.get("mobileNumber");
  }

  @Override
  public String getOfficeTelNumber() {
    return officeInfo.get("officeTelNumber");
  }

  @Override
  public String getJobPosition() {
    return officeInfo.get("jobPosition");
  }

  @Override
  public String getHomeTelNumber() {
    return homeInfo.get("homeTelNumber");
  }
}
