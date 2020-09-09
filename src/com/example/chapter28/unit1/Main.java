package com.example.chapter28.unit1;

public class Main {
  public static void main(String[] args) {
    /**
     * 享元模式
     * 定义：使用共享对象可有效地支持大量的细粒度的对象。
     * 如果池中对象太少，多个线程拿到同一对象后修改数据就会出现线程安全问题。
     * 主要解决的对象的共享问题，如何建立多个可共享的细粒度对象则是其关注的重点；而对象池主要解决复用。
     */
    String key = "科目一北京";
    // 初始化对象池
    SignInfoFactory.getSignInfo(key);
    // 计算执行10万次需要的时间
    long currentTime = System.currentTimeMillis();
    for (int i = 0; i < 10000000; i++) {
      SignInfoFactory.getSignInfo(key);
    }
    long tailTime = System.currentTimeMillis();
    System.out.println("执行时间："+(tailTime - currentTime) + " ms");
  }
}
