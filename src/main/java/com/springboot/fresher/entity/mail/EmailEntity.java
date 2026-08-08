package com.springboot.fresher.entity.mail;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EmailEntity {

    private String toEmail;
    private String subject;
    private String body;
    private String attachment;
}
