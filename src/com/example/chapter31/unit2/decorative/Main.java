package com.example.chapter31.unit2.decorative;

public class Main {
  public static void main(String[] args) {
    /**
     * 装饰模式
     */
    Swan duckling = new UglyDuckling();
    duckling = new StrongBehavior(duckling);
    duckling = new BeautifyAppearance(duckling);
    duckling.desAppaearance();
    duckling.cry();
    duckling.fly();
  }
}
