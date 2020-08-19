package com.example.chapter19.unit1;

import java.util.HashMap;
import java.util.Map;

public class OuterUser implements IOuterUser {
  @Override
  public Map<String, String> getUserBaseInfo() {
    Map<String, String> baseInfo = new HashMap<>();
    baseInfo.put("username", "混世魔王");
    baseInfo.put("mobileNumber", "13013001300");
    return baseInfo;
  }

  @Override
  public Map<String, String> getUserOfficeInfo() {
    Map<String, String> officeInfo = new HashMap<>();
    officeInfo.put("jobPosition", "海盗头子");
    officeInfo.put("officeTelNumber", "19999000099");
    return officeInfo;
  }

  @Override
  public Map<String, String> getUserHomeInfo() {
    Map<String, String> homeInfo = new HashMap<>();
    homeInfo.put("homeTelNumber", "47885680");
    homeInfo.put("homeAddress", "火星塔尔西斯");
    return homeInfo;
  }
}
