package com.example.chapter14.unit1;

import java.util.Random;

/**
 * 销售管理
 */
public class Sale extends AbstractColleague {
  public Sale(AbstractMediator mediator) {
    super(mediator);
  }

  public void sellIBMComputer(int number) {
    super.mediator.execute("sale.sell", number);
    System.out.println("销售IBM电脑" + number + "台");
  }

  public int getSaleStatus() {
    Random random = new Random(System.currentTimeMillis());
    int saleStatus = random.nextInt(100);
    System.out.println("IBM电脑销售情况为" + saleStatus);
    return saleStatus;
  }

  public void offsale() {
    super.mediator.execute("sale.offsale");
  }
}
