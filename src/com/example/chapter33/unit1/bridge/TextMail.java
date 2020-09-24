package com.example.chapter33.unit1.bridge;

public class TextMail extends MailTemplate {
  public TextMail(String from, String to, String subject, String context) {
    super(from, to, subject, context);
  }

  @Override
  public String getContext() {
    String context = "\nContent-Type: text/plain;charset=GB2312\n" + super.getContext();
    context += "\n邮件格式为：文本格式";
    return context;
  }
}
