package com.cts.project.user.Email;


import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;

import org.springframework.mail.SimpleMailMessage;



@Configuration

public class EmailConfig

{

  @Bean

  public SimpleMailMessage emailTemplate()

  {

    SimpleMailMessage message = new SimpleMailMessage();

    message.setTo("shivaprasadbandarupally68@gmail.com");

    message.setFrom("bennyben368@gmail.com");

    message.setSubject("Important email");

    message.setText("FATAL - Application crash. Save your job !!");

    return message;

  }

}