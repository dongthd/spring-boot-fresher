package com.springboot.fresher.service.impl;

import com.springboot.fresher.entity.mail.EmailEntity;
import com.springboot.fresher.service.EmailService;
import jakarta.mail.internet.MimeMessage;
import lombok.RequiredArgsConstructor;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class EmailServiceImpl implements EmailService {

    private static final String EMAIL_HOST = "localmail@gmail.com";

    private final JavaMailSender javaMailSender;

    @Override
    public String sendTextEmail(EmailEntity email) {
        try {
            SimpleMailMessage message = new SimpleMailMessage();

            message.setTo(email.getToEmail());
            message.setSubject(email.getSubject());
            message.setText(email.getBody());
            message.setFrom(EMAIL_HOST);

            javaMailSender.send(message);
            return "Email sent Successfully";
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String sendHtmlEmail(EmailEntity email) {
        try {
            MimeMessage message = javaMailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(message, true);

            helper.setFrom(EMAIL_HOST);
            helper.setTo(email.getToEmail());
            helper.setSubject(email.getSubject());
            helper.setText(email.getBody(), true);

            javaMailSender.send(message);
            return "Email sent HTMLs Successfully";
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String sendMailAttachmentEmail(EmailEntity email) {
        return "";
    }
}
