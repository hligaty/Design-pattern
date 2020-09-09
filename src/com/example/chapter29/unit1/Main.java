package com.example.chapter29.unit1;

public class Main {
  public static void main(String[] args) {
    /**
     * 桥梁模式
     * 定义：将抽象和实现解耦，使得两者可以独立地变化。
     * 抽象角色引用实际角色，即抽象角色的具体实现是由实际角色提供的。
     * 对于多次继承的情景，可以把变化的用桥梁模式抽离出去，避免对子类的影响
     */
    Product house = new House();
    RealtyCorp realtyCorp = new RealtyCorp(house);
    realtyCorp.makeMoney();

    ShanZhaiCorp shanZhaiCorp = new ShanZhaiCorp(new IPod());
    shanZhaiCorp.makeMoney();
  }
}
