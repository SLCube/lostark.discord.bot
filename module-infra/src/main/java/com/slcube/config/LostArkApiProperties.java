package com.slcube.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter
@Setter
@ConfigurationProperties(prefix = "lostark.api")
public class LostArkApiProperties {

    private String key;
    private String url = "https://developer-lostark.game.onstove.com/gamecontents/calendar";
}
