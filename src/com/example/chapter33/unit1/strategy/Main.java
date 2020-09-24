package com.example.chapter33.unit1.strategy;

public class Main {
  public static void main(String[] args) {
    /**
     * 策略模式
     */
    MailTemplate mail = new HtmlMail("123@123.com", "456@456.com", "有内鬼", "终止交易！");
    MailServer mailServer = new MailServer(mail);
    mailServer.sendMail();
  }
}
