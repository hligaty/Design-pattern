package com.example.chapter33.unit1.bridge;

public class Postfix extends MailServer {
  public Postfix(MailTemplate mail) {
    super(mail);
  }

  @Override
  public void sendMail() {
    //增加邮件服务器信息
    String context ="Received: from XXXX (unknown [xxx.xxx.xxx.xxx]) by aaa.aaa.com (Postfix) with ESMTP id 8DBCD172B8\n" ;
    super.mail.add(context);
    super.sendMail();
  }
}
