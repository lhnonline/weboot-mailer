package com.github.lhnonline.boot.mailer.util;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.extra.mail.MailAccount;
import cn.hutool.extra.mail.MailUtil;
import com.github.lhnonline.boot.mailer.properties.MailConfigProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnBean(MailConfigProperties.class)
public class Mailer {

    @Autowired
    private MailAccount account;

    @Autowired
    private MailConfigProperties properties;

    public void send(String subject, String content, boolean isHtml) {
        MailUtil.send(account, CollUtil.newArrayList(properties.getMailSet()), subject, content, isHtml);
    }

    public void send(String to, String subject, String content, boolean isHtml) {
        MailUtil.send(account, to, subject, content, isHtml);
    }
}
