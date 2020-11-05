package com.github.lhnonline.boot.mailer.config;

import cn.hutool.extra.mail.MailAccount;
import com.github.lhnonline.boot.mailer.properties.MailConfigProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MailAccountConfig {

    @Autowired
    private MailConfigProperties properties;

    @Bean
    @ConditionalOnProperty(prefix = "weboot.mailer", name = {"host"})
    public MailAccount mailAccount() {
        MailAccount account = new MailAccount();
        account.setHost(properties.getHost());
        account.setPort(properties.getPort());
        account.setAuth(true);
        account.setFrom(properties.getFrom());
        account.setUser(properties.getUser());
        account.setPass(properties.getPass());
        return account;
    }


}
