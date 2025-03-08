package com.slcube.application.use_case.out;

import com.slcube.model.CalendarSchedule;

import java.util.List;

public interface CalendarScheduleInfoPort {
    List<CalendarSchedule> fetchCalendarScheduleInfo();
}
