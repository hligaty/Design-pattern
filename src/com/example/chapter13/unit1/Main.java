package com.example.chapter13.unit1;

public class Main {
  public static void main(String[] args) throws CloneNotSupportedException {
    /**
     * 原型模式
     * 定义：通过拷贝原型实例获取新的对象
     * 注意一：拷贝不会执行构造函数，因为是直接在内存中拷贝二进制的
     * 注意二：浅拷贝是不会拷贝数组和对象的
     */
    Thing thing = new Thing("thing1");
    thing.getArrayList().add("1");
    Thing clone = (Thing) thing.clone();
    clone.getArrayList().add("1");
    clone.getArrayList().forEach(System.out::println);
  }
}
