package com.example.chapter19.unit1;

public class Main {
  public static void main(String[] args) {
    /**
     * 适配器模式
     * 定义：将一个类的接口变换成客户端所期待的另一种接口，从而使原本因接口不匹配而无法在一起工作的两个类能够在一起工作。
     */
    IUserInfo youngGirl1 = new UserInfo();
    System.out.println(youngGirl1.getMobileNumber());

    IUserInfo youngGirl2 = new OuterUserInfo();
    System.out.println(youngGirl2.getMobileNumber());
  }
}