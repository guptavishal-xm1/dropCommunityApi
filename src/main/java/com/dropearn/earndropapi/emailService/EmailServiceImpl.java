package com.dropearn.earndropapi.emailService;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailServiceImpl implements EmailService {

    final private JavaMailSender mailSender;
    @Value("${spring.mail.username}") private String sender;

    public EmailServiceImpl(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }

    @Override
    public String sendSimpleEmail(String to, String subject, String body) {
        try{
            SimpleMailMessage mailMessage = new SimpleMailMessage();
            mailMessage.setFrom(sender);
            mailMessage.setTo(to);
            mailMessage.setSubject(subject);
            mailMessage.setText(body);
            mailSender.send(mailMessage);
            return "Mail sent successfully";
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return "Mail sent failed";
        }

    }
}
