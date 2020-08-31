package com.example.chapter24.unit1;

import java.util.HashMap;
import java.util.Map;

public class Caretaker {
  private Map<String, IMemento> mementoMap;

  public Caretaker() {
    this.mementoMap = new HashMap<>();
  }

  public IMemento getMemento(String id) {
    return mementoMap.get(id);
  }

  public void setMemento(String id, IMemento memento) {
    mementoMap.put(id, memento);
  }
}
