package com.example.chapter8.unit1;

public class HumanFactory extends AbstractHumanFactory {
  @Override
  <T extends Human> T createHuman(Class<T> c) {
    try {
      return (T) Class.forName(c.getName()).newInstance();
    } catch (Exception e) {
      e.printStackTrace();
    }
    return null;
  }
}
