package com.example.chapter16.unit1;

public class Husband extends Handler {
  public Husband() {
    super(HUSBAND_LEVEL_REQUEST);
  }

  @Override
  public void response(IWomen women) {
    System.out.println("妻子请示。" + women.getRequest() + ",丈夫同意");
  }
}
