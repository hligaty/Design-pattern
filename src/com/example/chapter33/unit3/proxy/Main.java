package com.example.chapter33.unit3.proxy;

public class Main {
  public static void main(String[] args) {
    /**
     * 代理模式
     */
    IStar agent = new Agent(new Star());
    agent.sign();
  }
}
