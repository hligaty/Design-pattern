package com.example.chapter13.unit1;

import java.util.ArrayList;

public class Thing implements Cloneable{
  private String string;
  private ArrayList<String> arrayList = new ArrayList<>();

  public Thing(String string) {
    this.string = string;
    System.out.println("初始化");
  }

  @Override
  protected Object clone() throws CloneNotSupportedException {
    return super.clone();
  }

  public ArrayList<String> getArrayList() {
    return arrayList;
  }
}
