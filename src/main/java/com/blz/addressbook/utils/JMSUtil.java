package com.blz.addressbook.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class JMSUtil {
    @Autowired
    JavaMailSender javaMailSender;
    public void sendEmail(
            String toEmail,
            String subject,
            String body){
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("ss32922@gmail.com");
        message.setTo(toEmail);
        message.setText(body);
        message.setSubject(subject);

        javaMailSender.send(message);

        System.out.println("mail sent successfully...");
    }
}
