package com.example.chapter33.unit1.strategy;

public class HtmlMail extends MailTemplate {
  public HtmlMail(String from, String to, String subject, String context) {
    super(from, to, subject, context);
  }

  @Override
  public String getContext() {
    String context = "\nContent-Type: multipart/mixed; charset= GB2312\n" + super.getContext();
    context += "\n邮件格式为：超文本格式";
    return context;
  }
}
