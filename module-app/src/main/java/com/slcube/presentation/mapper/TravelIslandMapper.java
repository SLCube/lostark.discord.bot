package com.slcube.presentation.mapper;

import com.slcube.model.CalendarSchedule;
import com.slcube.presentation.dto.TravelIslandResponseDto;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class TravelIslandMapper {

    public static TravelIslandResponseDto toDto(CalendarSchedule calendarSchedule) {
        return new TravelIslandResponseDto();
    }
}
