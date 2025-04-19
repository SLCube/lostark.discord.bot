package com.slcube.listener;

import com.slcube.presentation.TravelIslandPresentation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.entities.channel.concrete.TextChannel;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.events.session.ReadyEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.TimeUnit;

@Slf4j
@RequiredArgsConstructor
@Component
public class TravelIslandDisCordListener extends ListenerAdapter {

    private final TravelIslandPresentation travelIslandPresentation;

    @Value("${discord.channel.id}")
    private String targetChannelId;

    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        if (!event.getChannel().getId().equals(targetChannelId)) return;

        User user = event.getAuthor();
        TextChannel textChannel = event.getChannel().asTextChannel();
        Message message = event.getMessage();

        if (user.isBot()) return;

        String msg = message.getContentDisplay();
        if (msg.equals("!모험섬")) {
            String receiveMessage = "receiveMessage";
            textChannel.sendMessage(receiveMessage).queue();
        }
    }

    @Override
    public void onReady(ReadyEvent event) {
        TextChannel channel = event.getJDA().getTextChannelById(targetChannelId);

        if (channel != null) {
            long initialDelay = calculateInitialDelay();
            long period = TimeUnit.DAYS.toMillis(1);

            String receiveMessage = "receiveMessage";
            event.getJDA().getGatewayPool().scheduleAtFixedRate(
                    () -> channel.sendMessage(receiveMessage).queue(),
                    initialDelay,
                    period,
                    TimeUnit.MILLISECONDS);
        }
    }

    private long calculateInitialDelay() {
        LocalDateTime now = LocalDateTime.now();

        LocalDateTime targetTime = now.withHour(10).withMinute(30).withSecond(0).withNano(0);
        if (now.isAfter(targetTime)) {
            targetTime = targetTime.plusDays(1); // 내일 오전 10시 30분
        }

        // 현재 시간과 목표 시간 사이의 차이를 밀리초 단위로 계산
        return ChronoUnit.MILLIS.between(now, targetTime);
    }
}
