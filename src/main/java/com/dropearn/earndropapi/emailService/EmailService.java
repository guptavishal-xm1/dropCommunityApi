package com.dropearn.earndropapi.emailService;

import org.springframework.stereotype.Service;

import java.net.http.HttpClient;
import java.util.Properties;


public interface EmailService {
    String sendSimpleEmail(String to, String subject, String body);
}
