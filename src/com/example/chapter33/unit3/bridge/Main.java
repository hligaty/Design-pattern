package com.example.chapter33.unit3.bridge;

public class Main {
  public static void main(String[] args) {
    /**
     * 桥梁模式
     */
    AbsAction actFilm = new ActFilm();
    // 影星默认当然是演电影
    AbsStar filmStar = new FilmStar();
    filmStar.doJob();
    // 歌星还可以演好看的电影
    AbsStar singer = new Singer(actFilm);
    singer.doJob();
  }
}
