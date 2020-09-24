package com.example.chapter33.unit1.bridge;

public class SendMail extends MailServer {
  public SendMail(MailTemplate mail) {
    super(mail);
  }

  @Override
  public void sendMail() {             //增加邮件服务器信息
    super.mail.add("Received: (sendmail); 7 Nov 2009 04:14:44 +0100");
    super.sendMail();
  }
}
