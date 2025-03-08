package com.slcube.application.service;

import com.slcube.application.use_case.in.ProvideCalendarScheduleInfoUseCase;
import com.slcube.application.use_case.out.CalendarScheduleInfoOutPort;
import com.slcube.model.CalendarSchedule;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;

@RequiredArgsConstructor
public class CalendarScheduleInfoService implements ProvideCalendarScheduleInfoUseCase {
    private final CalendarScheduleInfoOutPort outPort;


    @Override
    public List<CalendarSchedule> getTodayTravelIslandInfoList(LocalDateTime targetDate) {
        return filterTravelIslandInfoByTargetDate(outPort.fetchCalendarScheduleInfo(), targetDate);
    }

    private List<CalendarSchedule> filterTravelIslandInfoByTargetDate(List<CalendarSchedule> calendarScheduleList, LocalDateTime targetDate) {
        return Collections.EMPTY_LIST;
    }
}
