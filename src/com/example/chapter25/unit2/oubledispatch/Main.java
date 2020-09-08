package com.example.chapter25.unit2.oubledispatch;

public class Main {
  public static void main(String[] args) {
    /**
     * 双反派，根据实际类型决定真正的执行方法，其实就是让访问者调用this（被访问者本身）
     */
    AbsActor actor = new OldActor();
    Role role = new KungFuRole();

    role.accept(actor);
  }
}
