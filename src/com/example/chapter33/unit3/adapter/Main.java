package com.example.chapter33.unit3.adapter;

public class Main {
  public static void main(String[] args) {
    IActor actor = new UnknownActor();
    IStar star = new FilmStar();
    IStar standin = new Standin(actor);

    star.act("前15分钟明星演");
    standin.act("中间5分钟替身演");
    star.act("后15分钟明星演");
  }
}
