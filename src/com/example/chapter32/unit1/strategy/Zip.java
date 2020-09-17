package com.example.chapter32.unit1.strategy;

/**
 * ZIP算法
 */
public class Zip implements Algorithm {
  @Override
  public boolean compress(String source, String to) {
    System.out.println(source + "--->" + to + " ZIP压缩成功");
    return true;
  }

  @Override
  public boolean uncompress(String source, String to) {
    System.out.println(source + "--->" + to + " ZIP解压成功");
    return true;
  }
}
