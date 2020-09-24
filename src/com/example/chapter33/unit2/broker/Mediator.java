package com.example.chapter33.unit2.broker;

public class Mediator extends AbsMediator {

  @Override
  public void up(ISalary salary) {
    upSalary();
    upTax();
  }

  @Override
  public void up(IPosition position) {
    upPosition();
    upSalary();
    upTax();
  }

  @Override
  public void up(ITax tax) {
    upTax();
    downSalary();
  }

  @Override
  public void down(ISalary salary) {
    downSalary();
    downTax();
  }

  @Override
  public void down(IPosition position) {
    downPostion();
    downSalary();
    downTax();
  }

  @Override
  public void down(ITax tax) {
    downTax();
    downSalary();
  }

  private void upSalary() {
    System.out.println("工资翻倍，乐翻天");
  }

  private void upTax() {
    System.out.println("税收上升，为国家做贡献");
  }

  private void upPosition() {
    System.out.println("职位上升一级，狂喜");
  }

  private void downSalary() {
    System.out.println("经济不景气，降低工资");
  }

  private void downTax() {
    System.out.println("税收减低，国家收入减少");
  }

  private void downPostion() {
    System.out.println("官降三级，比自杀还痛苦");
  }
}
