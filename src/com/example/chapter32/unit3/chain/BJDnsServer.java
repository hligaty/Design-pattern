package com.example.chapter32.unit3.chain;

public class BJDnsServer extends DnsServer {

  @Override
  protected Recorder echo(String domain) {
    Recorder recorder = super.echo(domain);
    recorder.setOwner("北京DNS服务器");
    return recorder;
  }

  @Override
  protected boolean isLocal(String domain) {
    return domain.endsWith(".bj.cn");
  }
}
