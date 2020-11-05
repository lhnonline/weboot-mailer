package com.github.lhnonline.boot.mailer.properties;


import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.Set;

/**
 * @author luohaonan
 * @date 2020-11-11
 * @email 0376lhn@gmail.com
 * @description
 */

@Getter
@Setter
@ConfigurationProperties(prefix = "weboot.mailer")
public class MailConfigProperties {

    private String host;
    private int port;
    private String from;
    private String user;
    private String pass;
    private Set<String> mailSet;
}
