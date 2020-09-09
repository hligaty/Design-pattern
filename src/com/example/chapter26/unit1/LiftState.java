package com.example.chapter26.unit1;

public abstract class LiftState {
  protected Context context;

  public Context getContext() {
    return context;
  }

  public void setContext(Context context) {
    this.context = context;
  }

  public abstract void open();

  public abstract void close();

  public abstract void run();

  public abstract void stop();
}
