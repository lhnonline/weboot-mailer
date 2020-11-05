

## weboot-mailer


## 配置文件

```yaml
weboot:
  mailer:
    host: smtp.qq.com
    port: 25
    from: luohaonan0507@foxmail.com
    user: 3347287828
    pass: ynhsiqlwevbdcibga
    mailSet:
      - 1139847491@qq.com
      - 490902590@qq.com

```

## pom.xml
```xml
<dependency>
     <groupId>com.github.lhnonline</groupId>
     <artifactId>weboot-mailer</artifactId>
     <version>1.0.0</version>
</dependency>
```

## use
```java

    @Autowired
    private Mailer mailer;

    @GetMapping("/")
    public void mail() {
        // send to weboot.mailer.mailset 
        mailer.send("今晚打老虎", "不怕对方出老千", false);
        // send to specific mail
        mailer.send("3347287828@qq.com", "今晚打老虎!", "不怕对方出老千", false);
    }
    
```