package com.slcube.application.use_case.out;

import com.slcube.model.CalendarSchedule;

import java.time.LocalDateTime;
import java.util.List;

public interface CalendarScheduleInfoOutPort {
    List<CalendarSchedule> fetchCalendarScheduleInfo();
}
