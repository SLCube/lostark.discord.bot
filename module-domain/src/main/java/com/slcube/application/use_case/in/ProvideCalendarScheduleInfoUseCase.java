package com.slcube.application.use_case.in;

import com.slcube.model.CalendarSchedule;

import java.time.LocalDateTime;
import java.util.List;

public interface ProvideCalendarScheduleInfoUseCase {

    List<CalendarSchedule> getTodayTravelIslandInfoList(LocalDateTime targetDate);
}
