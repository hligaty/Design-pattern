package com.example.chapter16.unit1;

public abstract class Handler {
  public static final int FATHER_LEVEL_REQUEST = 1;
  public static final int HUSBAND_LEVEL_REQUEST = 2;
  public static final int SON_LEVEL_REQUEST = 3;

  private int level = 0;

  private Handler nextHandler;

  public Handler(int level) {
    this.level = level;
  }

  public final void handlerMessage(IWomen women) {
    if (women.getType() == this.level) {
      this.response(women);
    } else {
      if (this.nextHandler != null) {
        this.nextHandler.handlerMessage(women);
      } else {
        System.out.println("没地方请示了，按不同意处理");
      }
    }
  }

  public void setNext(Handler handler) {
    this.nextHandler = handler;
  }

  public abstract void response(IWomen women);
}
