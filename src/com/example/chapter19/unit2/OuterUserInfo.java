package com.example.chapter19.unit2;

import java.util.Map;

public class OuterUserInfo implements IUserInfo {
  private IOuterUserBaseInfo baseInfo;
  private IOuterUserHomeInfo homeInfo;
  private IOuterUserOfficeInfo officeInfo;

  private Map<String, String> baseMap;
  private Map<String, String> homeMap;
  private Map<String, String> officeMap;

  public OuterUserInfo(IOuterUserBaseInfo baseInfo, IOuterUserHomeInfo homeInfo, IOuterUserOfficeInfo officeInfo) {
    this.baseInfo = baseInfo;
    this.homeInfo = homeInfo;
    this.officeInfo = officeInfo;
    this.baseMap = this.baseInfo.getUserBaseInfo();
    this.homeMap = this.homeInfo.getUserHomeInfo();
    this.officeMap = this.officeInfo.getUserOfficeInfo();
  }

  @Override
  public String getUserName() {
    return this.baseMap.get("userName");
  }

  @Override
  public String getHomeAddress() {
    return this.homeMap.get("homeAddress");
  }

  @Override
  public String getMobileNumber() {
    return this.baseMap.get("mobileNumber");
  }

  @Override
  public String getOfficeTelNumber() {
    return this.officeMap.get("officeTelNumber");
  }

  @Override
  public String getJobPosition() {
    return this.officeMap.get("jobPosition");
  }

  @Override
  public String getHomeTelNumber() {
    return this.homeMap.get("homeTelNumber");
  }
}
