package com.dropearn.earndropapi.emailService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailServiceImpl implements EmailService {

    @Autowired private JavaMailSender mailSender;
    @Value("${spring.mail.username}") private String sender;

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
            return "Mail sent failed";
        }

    }
}
