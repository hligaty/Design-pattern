package com.example.chapter31.unit1.proxy;

public class Main {
  public static void main(String[] args) {
    /**
     * 代理模式
     * 把当前的行为或功能委托给其他对象执行，代理类负责接口限定：
     * 是否可以调用真实角色，以及是否对发送到真实角色的消息进行变形处理
     * 它不对被主题角色（也就是被代理类）的功能做任何处理，保证原汁原味的调用。
     */
    IRunner runner = new Runner();
    IRunner proxy = new RunnerProxy(runner);
    System.out.println("====客人找到运动员的代理要求其去跑步===");
    proxy.run();
  }
}
