package com.example.chapter22.unit1;

import java.util.Observable;

public class HanFeiZhi extends Observable {
  public void haveBreakfast() {
    System.out.println("韩非子在吃饭");
    super.setChanged();
    super.notifyObservers("韩非子去吃饭了");
  }

  public void haveFun() {
    System.out.println("韩非子在娱乐");
    super.setChanged();
    super.notifyObservers("韩非子去娱乐了");
  }
}
