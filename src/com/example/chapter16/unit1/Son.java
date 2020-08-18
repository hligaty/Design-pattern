package com.example.chapter16.unit1;

public class Son extends Handler {
  public Son() {
    super(SON_LEVEL_REQUEST);
  }

  @Override
  public void response(IWomen women) {
    System.out.println("母亲请示。" + women.getRequest() + ",儿子同意");
  }
}
