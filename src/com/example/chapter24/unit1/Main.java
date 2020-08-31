package com.example.chapter24.unit1;

public class Main {
  public static void main(String[] args) {
    /**
     * 备忘录模式
     * 定义：在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态。这样以后就可将该对象恢复到原先保存的状态。
     */
    //发起人
    Originator originator = new Originator();
    //备忘录管理人
    Caretaker caretaker = new Caretaker();
    originator.setState1("中国");
    originator.setState2("强盛");
    originator.setState3("繁荣");

    caretaker.setMemento("001", originator.createMemento());

    originator.setState1("软件");
    originator.setState2("架构");
    originator.setState3("优秀");

    originator.restoreMemento(caretaker.getMemento("002"));
    System.out.println(originator);
  }
}
