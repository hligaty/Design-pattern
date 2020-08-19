package com.example.chapter19.unit2;

import java.util.HashMap;
import java.util.Map;

public class OuterUserBaseInfo implements IOuterUserBaseInfo {

  @Override
  public Map<String, String> getUserBaseInfo() {
    Map<String, String> baseInfo = new HashMap<>();
    baseInfo.put("userName", "这个员工叫混世魔王...");
    baseInfo.put("mobileNumber", "这个员工电话是...");
    return baseInfo;
  }
}
