package com.example.chapter32.unit1.command;

public class ZipCompressCmd extends AbstractCmd {
  @Override
  public boolean execute(String source, String to) {
    return super.zip.compress(source, to);
  }
}
