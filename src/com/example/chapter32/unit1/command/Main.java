package com.example.chapter32.unit1.command;

public class Main {
  public static void main(String[] args) {
    /**
     * 命令模式
     * ，如果没有接受者就是退化为策略模式
     * 但如果按职责划分为压缩算法和解压算法，策略模式只能修改接口新增方法，但命令模式就可以，因为它着重于请求者和接收者解耦
     */
    String source = "/home/ly/123";
    String to = "/home/ly/123.zip";

    Invoker invoker = new Invoker(new ZipCompressCmd());
    invoker.execute(source, to);

  }
}
