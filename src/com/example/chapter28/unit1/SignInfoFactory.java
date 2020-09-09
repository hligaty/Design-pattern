package com.example.chapter28.unit1;

import java.util.HashMap;
import java.util.Map;

public class SignInfoFactory {
  private static Map<String, SignInfo> pool = new HashMap<>();

  public static SignInfo getSignInfo(String key) {
    SignInfo result;
    if (pool.containsKey(key)) {
      result = pool.get(key);
//      System.out.println("直接从池中获取");
    } else {
//      System.out.println("建立对象，放到池中");
      result = new SignInfo();
      pool.put(key, result);
    }
    return result;
  }
}
