package com.example.chapter32.unit3.chain;

public class Main {
  public static void main(String[] args) {
    /**
     * 责任链模式
     */
    DnsServer bj = new BJDnsServer();
    DnsServer china = new ChinaTopDnsServer();
    DnsServer top = new TopDnsServer();

    bj.setUpperServer(china);
    china.setUpperServer(top);

    String domain1 = "www.123.bj.cn";
    String domain2 = "www.123.cn";
    String domain3 = "www.123.com";
    System.out.println(domain1 + "解析结果：" + bj.resolve(domain1));
    System.out.println(domain2 + "解析结果：" + bj.resolve(domain2));
    System.out.println(domain3 + "解析结果：" + bj.resolve(domain3));
  }
}
