package com.example.chapter33.unit1.bridge;

public abstract class MailServer {
  protected final MailTemplate mail;

  public MailServer(MailTemplate mail) {
    this.mail = mail;
  }

  public void sendMail() {
    System.out.println("===正在发送的邮件信息===");
    System.out.println("发件人："+this.mail.getFrom());
    System.out.println("收件人："+this.mail.getTo());
    System.out.println("邮件标题："+this.mail.getSubject());
    System.out.println("邮件内容："+this.mail.getContext());
  }
}
