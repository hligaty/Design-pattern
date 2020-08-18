package com.example.chapter15.unit1;

public class Main {
  public static void main(String[] args) {
    /**
     * 命令模式
     * 定义：将一个请求封装成一个对象，从而让你使用不同的请求把客户端参数化，对请求排队或者记录请求日志，可以提供命令的撤销和恢复功能。
     * 高层模块（调用方）完全不了解低层模块（接受者）
     */
    Invoker zhangshan = new Invoker();
    Command command = new AddRequirementCommand();
    zhangshan.setCommand(command);
    zhangshan.action();
  }
}
