package com.example.chapter32.unit1.strategy;

/**
 * 抽象压缩算法
 */
public interface Algorithm {
  boolean compress(String source, String to);

  boolean uncompress(String source, String to);

}
