package com.example.chapter32.unit3.observer;

public class Main {
  public static void main(String[] args) {
    /**
     * 观察者模式
     */
    DnsServer bj = new BJDnsServer();
    DnsServer china = new ChinaTopDnsServer();
    DnsServer top = new TopDnsServer();

    bj.setUpperServer(china);
    china.setUpperServer(top);

    String domain1 = "www.123.bj.cn";
    String domain2 = "www.123.cn";
    String domain3 = "www.123.com";
    Recorder recorder = new Recorder();

    recorder.setDomain(domain1);
    bj.update(null, recorder);
    System.out.println(domain1 + "解析结果：" + recorder);

    recorder.setDomain(domain2);
    bj.update(null, recorder);
    System.out.println(domain2 + "解析结果：" + recorder);

    recorder.setDomain(domain3);
    bj.update(null, recorder);
    System.out.println(domain3 + "解析结果：" + recorder);
  }
}
