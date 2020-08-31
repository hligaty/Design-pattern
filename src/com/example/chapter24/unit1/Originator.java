package com.example.chapter24.unit1;

import java.util.Map;
import java.util.Objects;

public class Originator {
  private String state1;
  private String state2;
  private String state3;

  public String getState1() {
    return state1;
  }

  public void setState1(String state1) {
    this.state1 = state1;
  }

  public String getState2() {
    return state2;
  }

  public void setState2(String state2) {
    this.state2 = state2;
  }

  public String getState3() {
    return state3;
  }

  public void setState3(String state3) {
    this.state3 = state3;
  }

  private class Memento implements IMemento {
    private Map<String, Object> stateMap;

    public Memento(Map<String, Object> stateMap) {
      this.stateMap = stateMap;
    }

    public Map<String, Object> getStateMap() {
      return stateMap;
    }

    public void setStateMap(Map<String, Object> stateMap) {
      this.stateMap = stateMap;
    }
  }

  public IMemento createMemento() {
    return new Memento(BeanUtils.backupProp(this));
  }

  public void restoreMemento(IMemento memento) {
    Objects.requireNonNull(memento, "备忘录不存在");
    BeanUtils.restoreProp(this, ((Memento) memento).getStateMap());
  }

  @Override
  public String toString() {
    return "Originator{" +
            "state1='" + state1 + '\'' +
            ", state2='" + state2 + '\'' +
            ", state3='" + state3 + '\'' +
            '}';
  }
}
