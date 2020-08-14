package com.example.chapter9.unit1;

public interface HumanFactory {

  /**
   * 白人
   * @return Human
   */
  Human createWhiteHuman();

  /**
   * 黑人
   * @return Human
   */
  Human createBlackHuman();

  /**
   * 黄种人
   * @return Human
   */
  Human createYellowHuman();
}
