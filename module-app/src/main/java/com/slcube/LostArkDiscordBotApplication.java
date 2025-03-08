package com.slcube;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@PropertySource("classpath:/application-lostarkApi.yml")
@SpringBootApplication
public class LostArkDiscordBotApplication {
    public static void main(String[] args) {
        SpringApplication.run(LostArkDiscordBotApplication.class, args);
    }
}
