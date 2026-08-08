package com.springboot.fresher.service;

import com.springboot.fresher.entity.mail.EmailEntity;

public interface EmailService {
    String sendTextEmail(EmailEntity email);

    String sendHtmlEmail(EmailEntity email);

    String sendMailAttachmentEmail(EmailEntity email);
}
