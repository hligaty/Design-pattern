package com.example.chapter33.unit2.broker;

public class Main {
  public static void main(String[] args) {
    /**
     * 中介者模式
     * 在接收到需求后我们发现职位、工资、税收之间有着紧密的耦合关系，
     * 如果不采用中介者模式，则每个对象都要与其他两个对象进行通信，这势必会增加系统的复杂性，同时也使系统处于僵化状态，很难实现拥抱变化的理想。
     * 通过增加一个中介者，每个同事类的职位、工资、税收都只与中介者通信，中介者封装了各个同事类之间的逻辑关系，方便系统的扩展和维护。
     */
    Mediator mediator = new Mediator();
    IPosition position = new Position(mediator);
    ISalary salary = new Salary(mediator);
    ITax tax = new Tax(mediator);

    mediator.setPosition(position);
    mediator.setSalary(salary);
    mediator.setTax(tax);

    position.demote();

  }
}
