package com.example.chapter22.unit1;

import java.util.Observable;
import java.util.Observer;

public class Liushi implements Observer {

  @Override
  public void update(Observable o, Object arg) {
    System.out.println("刘斯:知道"+arg.toString());
  }
}
