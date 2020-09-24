package com.example.chapter32.unit2.strategy;

public class Main {
  public static void main(String[] args) {
    /**
     * 策略模式
     */
    Context context = new Context();

    System.out.println("====儿童的主要工作===");
    context.setWorkAlgorithm(new ChildWork());
    context.work();

    System.out.println("====成年人的主要工作===");
    context.setWorkAlgorithm(new AdultWork());
    context.work();

    System.out.println("====老年人的主要工作===");
    context.setWorkAlgorithm(new OldWork());
    context.work();
  }
}
