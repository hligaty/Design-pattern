package com.example.chapter14.unit1;

/**
 * 抽象中介
 */
public abstract class AbstractMediator {
  public void setPurchase(Purchase purchase) {
    this.purchase = purchase;
  }

  public void setSale(Sale sale) {
    this.sale = sale;
  }

  public void setStock(Stock stock) {
    this.stock = stock;
  }

  Purchase purchase;
  Sale sale;
  Stock stock;

  public abstract void execute(String str, Object... objects);
}
