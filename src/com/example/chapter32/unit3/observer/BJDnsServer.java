package com.example.chapter32.unit3.observer;

public class BJDnsServer extends DnsServer {
  @Override
  protected void sign(Recorder recorder) {
    recorder.setOwner("北京DNS服务器");
  }

  @Override
  protected boolean isLocal(Recorder recorder) {
    return recorder.getDomain().endsWith(".bj.cn");
  }
}
