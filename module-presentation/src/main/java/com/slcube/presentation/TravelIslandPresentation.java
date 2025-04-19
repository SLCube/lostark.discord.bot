package com.slcube.presentation;

import com.slcube.application.use_case.in.ProvideCalendarScheduleInfoUseCase;
import com.slcube.presentation.dto.TravelIslandResponseDto;
import com.slcube.presentation.mapper.TravelIslandMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;

@Component
@RequiredArgsConstructor
public class TravelIslandPresentation {

    private final ProvideCalendarScheduleInfoUseCase calendarScheduleInfoUseCase;

    public List<TravelIslandResponseDto> getTravelIslands() {
        return calendarScheduleInfoUseCase.getTravelIslandInfoListByTargetDate(LocalDate.now())
                .stream()
                .map(TravelIslandMapper::toDto)
                .toList();
    }
}
