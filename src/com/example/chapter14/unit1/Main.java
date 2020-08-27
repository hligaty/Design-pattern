package com.example.chapter14.unit1;

public class Main {
  public static void main(String[] args) {
    /**
     * 中介者模式
     * 定义：用一个中介对象封装一系列的对象交互，中介者使各对象不需要显示地相互作用，从而使其耦合松散，而且可以独立地改变它们之间的交互。
     * 当类图出现网状结构时使用，将其改造成星型结构
     */
    AbstractMediator mediator = new Mediator();

    Purchase purchase = new Purchase(mediator);
    Sale sale = new Sale(mediator);
    Stock stock = new Stock(mediator);

    mediator.setPurchase(purchase);
    mediator.setSale(sale);
    mediator.setStock(stock);

    purchase.buyIBMComputer(100);
    sale.sellIBMComputer(1);
    stock.clearStock();
  }
}
