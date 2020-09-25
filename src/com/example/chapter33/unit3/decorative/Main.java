package com.example.chapter33.unit3.decorative;

public class Main {
  public static void main(String[] args) {
    /**
     * 装饰模式
     */
    IStar star = new FreakStar();
    star = new HotAir(star);
    star = new Hard(star);
    star.act();
  }
}