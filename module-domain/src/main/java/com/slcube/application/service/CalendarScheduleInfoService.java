package com.slcube.application.service;

import com.slcube.application.use_case.in.ProvideCalendarScheduleInfoUseCase;
import com.slcube.application.use_case.out.CalendarScheduleInfoOutPort;
import com.slcube.model.CalendarSchedule;
import lombok.RequiredArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@RequiredArgsConstructor
public class CalendarScheduleInfoService implements ProvideCalendarScheduleInfoUseCase {

    private final CalendarScheduleInfoOutPort outPort;

    @Override
    public List<CalendarSchedule> getTodayTravelIslandInfoList(LocalDate targetDate) {
        return filterTravelIslandInfoByTargetDate(outPort.fetchCalendarScheduleInfo(), targetDate);
    }

    private List<CalendarSchedule> filterTravelIslandInfoByTargetDate(List<CalendarSchedule> calendarScheduleList, LocalDate targetDate) {
        return calendarScheduleList.stream()
                .filter(calendarSchedule -> calendarSchedule.getCategoryName().equals("모험 섬"))
                .filter(calendarSchedule -> {
                    List<LocalDateTime> startTimes = calendarSchedule.getStartTimes();
                    return startTimes != null && startTimes.stream()
                            .anyMatch(startTime -> startTime.toLocalDate().equals(targetDate));
                }).toList();
    }
}
