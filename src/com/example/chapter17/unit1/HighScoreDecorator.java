package com.example.chapter17.unit1;

public class HighScoreDecorator extends Decorator {
  public HighScoreDecorator(SchoolReport report) {
    super(report);
  }

  @Override
  public void report() {
    reportHighScore();
    super.report();
  }

  private void reportHighScore() {
    System.out.println("最高分80");
  }
}
