package com.example.chapter19.unit1;

import java.util.Map;

/**
 * 外包人员
 */
public interface IOuterUser {
  /**
   * 基本信息
   * @return
   */
  public Map<String, String> getUserBaseInfo();

  /**
   * 工作信息
   * @return
   */
  public Map<String, String> getUserOfficeInfo();

  /**
   * 家庭信息
   * @return
   */
  public Map<String, String> getUserHomeInfo();
}
