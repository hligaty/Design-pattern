package com.example.chapter26.unit1;

public class Main {
  public static void main(String[] args) {
    /**
     * 状态模式
     * 定义：当一个对象内在状态改变时允许其改变行为，这个对象看起来像改变了其类。
     * 环境角色有两个不成文的约束：
     * 1.把状态对象声明为静态常量，有几个状态对象就声明几个静态常量。
     * 2.环境角色具有状态抽象角色定义的所有行为，具体执行使用委托方式。
     */
    Context context = new Context();
    context.setLiftState(Context.closingState);

    context.open();
    context.close();
    context.run();
    context.stop();
  }
}
