package com.example.chapter32.unit1.strategy;

public class Gzip implements Algorithm {
  @Override
  public boolean compress(String source, String to) {
    System.out.println(source + "--->" + to + " GZIP压缩成功");
    return true;
  }

  @Override
  public boolean uncompress(String source, String to) {
    System.out.println(source + "--->" + to + " GZIP压缩成功");
    return true;
  }
}
