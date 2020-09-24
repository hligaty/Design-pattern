package com.example.chapter14.unit1;

public class Mediator extends AbstractMediator {

  @Override
  public void execute(String str, Object... objects) {
    switch (str) {
      case "purchase.buy":
        this.buyComputer((Integer) objects[0]);
        break;
      case "sale.sell":
        this.sellComputer((Integer) objects[0]);
        break;
      case "sale.offsale":
        this.offSell();
        break;
      case "stock.clear":
        this.clearStock();
        break;
      default:
        break;
    }
  }

  /**
   * 采购电脑
   *
   * @param number
   */
  private void buyComputer(int number) {
    int saleStatus = super.sale.getSaleStatus();
    if (saleStatus > 80) {
      super.stock.increase(number);
    } else {
      super.stock.increase(number / 2);
    }
  }

  /**
   * 销售电脑
   *
   * @param number
   */
  private void sellComputer(int number) {
    if (super.stock.getStockNumber() < number) {
      super.purchase.buyIBMComputer(number);
    } else {
      super.stock.decrease(number);
    }
  }

  /**
   * 折价销售电脑
   */
  private void offSell() {
    System.out.println("折价销售IBM电脑" + super.stock.getStockNumber() + "台");
  }

  /**
   * 清仓处理
   */
  private void clearStock() {
    super.sale.offsale();
    super.purchase.refuseBuyIBM();
  }
}
