package com.santam.emailservice.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.santam.emailservice.adapters.EmailSenderGateway;
import com.santam.emailservice.core.EmailSenderUserCase;

@Service
public class EmailSenderService implements EmailSenderUserCase {
  private final EmailSenderGateway emailSenderGateway;

  @Autowired
  public EmailSenderService(EmailSenderGateway emailSenderGateway) {
    this.emailSenderGateway = emailSenderGateway;
  }

  @Override
  public void sendEmail(String to, String subject, String body) {
    this.emailSenderGateway.sendEmail(to, subject, body);
  }
  
}
