package com.example.chapter32.unit1.strategy;

public class Main {
  public static void main(String[] args) {
    /**
     * 命令模式
     */
    String source = "/home/ly/123";
    String to = "/home/ly/123.zip";

    Context context = new Context(new Zip());
    System.out.println("------执行算法------");
    context.compress(source, to);
    context.uncompress(to, source);
  }
}
