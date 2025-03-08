package com.slcube.config.travel_island;

import com.slcube.application.service.CalendarScheduleInfoService;
import com.slcube.application.use_case.in.ProvideCalendarScheduleInfoUseCase;
import com.slcube.application.use_case.out.CalendarScheduleInfoPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TravelIslandAppDiConfig {

    @Bean
    public ProvideCalendarScheduleInfoUseCase provideCalendarScheduleInfoUseCase(CalendarScheduleInfoPort calendarScheduleInfoPort) {
        return new CalendarScheduleInfoService(calendarScheduleInfoPort);
    }
}
