package com.slcube.application.use_case.in;

import com.slcube.model.CalendarSchedule;

import java.time.LocalDate;
import java.util.List;

public interface ProvideCalendarScheduleInfoUseCase {

    List<CalendarSchedule> getTodayTravelIslandInfoList(LocalDate targetDate);
}
