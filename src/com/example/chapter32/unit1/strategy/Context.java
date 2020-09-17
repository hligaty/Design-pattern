package com.example.chapter32.unit1.strategy;

public class Context{
  private Algorithm algorithm;

  public Context(Algorithm algorithm) {
    this.algorithm = algorithm;
  }

  public boolean compress(String source, String to) {
    return this.algorithm.compress(source, to);
  }

  public boolean uncompress(String source, String to) {
    return this.algorithm.uncompress(source, to);
  }
}
