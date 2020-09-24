package com.example.chapter33.unit1.bridge;


public class Main {
  public static void main(String[] args) {
    /**
     * 桥梁模式
     */
    MailTemplate mail = new HtmlMail("123@123.com", "456@456.com", "有内鬼", "终止交易！");
    MailServer mailServer = new Postfix(mail);
    mailServer.sendMail();
  }
}
