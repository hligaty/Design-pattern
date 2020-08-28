package com.example.chapter22.unit1;

import java.util.Observable;
import java.util.Observer;

public class Lishi implements Observer {

  @Override
  public void update(Observable o, Object arg) {
    System.out.println("李斯:知道"+arg.toString());
  }
}
