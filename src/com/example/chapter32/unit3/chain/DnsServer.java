package com.example.chapter32.unit3.chain;

import java.util.Random;

public abstract class DnsServer {
  /**
   * 上层DNS
   */
  private DnsServer upperServer;

  public void setUpperServer(DnsServer upperServer) {
    this.upperServer = upperServer;
  }

  public final Recorder resolve(String domain) {
    Recorder recorder;
    if (isLocal(domain)) {
      recorder = echo(domain);
    } else {
      recorder = upperServer.resolve(domain);
    }
    return recorder;
  }

  protected abstract boolean isLocal(String domain);

  protected Recorder echo(String domain) {
    Recorder recorder = new Recorder();
    recorder.setDomain(domain);
    recorder.setIp(getIpAddress());
    return recorder;
  }

  private String getIpAddress() {
    Random random = new Random();
    return random.nextInt(255) + "." + random.nextInt(255) + "." + random.nextInt(255) + "." + random.nextInt(255);
  }
}
