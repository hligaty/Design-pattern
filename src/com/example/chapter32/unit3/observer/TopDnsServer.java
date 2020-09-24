package com.example.chapter32.unit3.observer;

public class TopDnsServer extends DnsServer {
  @Override
  protected void sign(Recorder recorder) {
    recorder.setOwner("全球顶级DNS服务器");
  }

  @Override
  protected boolean isLocal(Recorder recorder) {
    return true;
  }
}
