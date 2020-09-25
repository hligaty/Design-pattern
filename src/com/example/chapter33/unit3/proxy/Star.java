package com.example.chapter33.unit3.proxy;

public class Star implements IStar {
  @Override
  public void sign() {
    System.out.println("明星签字：我是XXX大明星");
  }
}
