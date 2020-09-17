package com.example.chapter32.unit1.command;

public interface IReceiver {
  boolean compress(String source, String to);

  boolean uncompress(String source, String to);
}
