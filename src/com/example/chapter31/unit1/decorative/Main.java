package com.example.chapter31.unit1.decorative;

import com.example.chapter31.unit1.proxy.IRunner;
import com.example.chapter31.unit1.proxy.Runner;

public class Main {
  public static void main(String[] args) {
    /**
     * 装饰模式
     * 保证接口不变的情况下加强类的功能
     * 它保证的是被修饰的对象功能比原始对象丰富（当然，也可以减弱），但不做准入条件判断和准入参数过滤
     * 是否可以执行类的功能，过滤输入参数是否合规等，这不是装饰模式关心的。
     */
    IRunner runner = new Runner();
    runner = new RunnerWithJet(runner);
    runner.run();
  }
}
