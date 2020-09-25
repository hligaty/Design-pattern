package com.example.chapter33.unit3.bridge;

/**
 * 电影明星
 */
public class FilmStar extends AbsStar {
  public FilmStar() {
    super(new ActFilm());
  }

  public FilmStar(AbsAction action) {
    super(action);
  }

  @Override
  public void doJob() {
    System.out.println("===影星===");
    super.doJob();
  }
}
