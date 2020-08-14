package com.example.chapter12.unit3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class GamePlayIH implements InvocationHandler {
  Class cls;
  Object object;

  public GamePlayIH(Object object) {
    this.object = object;
  }

  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    Object result = method.invoke(this.object, args);
    return result;
  }
}
