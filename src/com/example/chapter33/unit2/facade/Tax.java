package com.example.chapter33.unit2.facade;

import java.util.Random;

public class Tax {
  public int getTax() {
    // 交纳一个随机数量的税金
    return (new Random()).nextInt(300);
  }
}
