package com.slcube.listener;

import com.slcube.application.use_case.in.ProvideCalendarScheduleInfoUseCase;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Slf4j
@RequiredArgsConstructor
@Component
public class TravelIslandDisCordListener extends ListenerAdapter {

    private final ProvideCalendarScheduleInfoUseCase calendarScheduleInfoUseCase;

    @Value("${discord.channel.id}")
    private String targetChannelId;


}
