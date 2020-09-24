package com.example.chapter32.unit3.observer;

import java.util.Observable;
import java.util.Observer;
import java.util.Random;

public abstract class DnsServer extends Observable implements Observer {
  @Override
  public void update(Observable o, Object arg) {
    Recorder recorder = (Recorder) arg;
    if (isLocal(recorder)) {
      recorder.setIp(getIpAddress());
    } else {
      // 本机不能解析，则提交到上级DNS
      responsFromUpperServer(recorder);
    }
    sign(recorder);
  }

  /**
   * 签名
   */
  protected abstract void sign(Recorder recorder);

  /**
   * 定义处理级别
   */
  protected abstract boolean isLocal(Recorder recorder);

  /**
   * 作为被观察者，允许增加观察者，这里上级DNS一般只有一个
   */
  public void setUpperServer(DnsServer dnsServer) {
    super.deleteObservers();
    super.addObserver(dnsServer);
  }

  /**
   * 向父DNS解析，也就是通知观察者
   */
  private void responsFromUpperServer(Recorder recorder) {
    super.setChanged();
    super.notifyObservers(recorder);
  }

  private String getIpAddress() {
    Random random = new Random();
    return random.nextInt(255) + "." + random.nextInt(255) + "." + random.nextInt(255) + "." + random.nextInt(255);
  }
}
