package com.example.chapter16.unit1;

public class Father extends Handler {
  public Father() {
    super(FATHER_LEVEL_REQUEST);
  }

  @Override
  public void response(IWomen women) {
    System.out.println("女儿请示。" + women.getRequest() + ",父亲同意");
  }
}
