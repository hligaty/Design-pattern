package com.example.chapter11.unit1;

public class Main {

  public static void main(String[] args) throws InterruptedException {
    /**
     * 建造者模式
     * 定义：一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示。
     */
    Director director = new Director();
    //一万辆 A 型奔驰
    for (int i = 0; i < 1; i++) {
      director.getBenzAModel().run();
    }
    //一万辆 B 型奔驰
    for (int i = 0; i < 1; i++) {
      director.getBenzBModel().run();
    }
    //一万辆 C 型宝马
    for (int i = 0; i < 1; i++) {
      director.getBMWCModel().run();
    }
    //一万辆 D 型宝马
    for (int i = 0; i < 1; i++) {
      director.getBMWDModel().run();
    }
  }
}