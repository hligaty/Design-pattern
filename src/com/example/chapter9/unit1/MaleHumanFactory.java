package com.example.chapter9.unit1;

public class MaleHumanFactory implements HumanFactory {
  @Override
  public Human createWhiteHuman() {
    return new MaleWhiteHuman();
  }

  @Override
  public Human createBlackHuman() {
    return new MaleBlackHuman();
  }

  @Override
  public Human createYellowHuman() {
    return new MaleYellowHuman();
  }
}
