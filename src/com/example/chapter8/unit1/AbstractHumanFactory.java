package com.example.chapter8.unit1;

public abstract class AbstractHumanFactory {

  /**
   * 创造人
   * @param c 类型
   * @param <T>
   * @return
   */
  abstract <T extends Human> T createHuman(Class<T> c);
}
