package com.slcube.mapper;

import com.slcube.dto.CalendarScheduleInfoDto;
import com.slcube.model.CalendarSchedule;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class CalendarScheduleMapper {

    public static CalendarSchedule toDomain(CalendarScheduleInfoDto dto) {
        List<CalendarSchedule.Item> items = dto.getRewardItems().get(0)
                .getItems().stream()
                .map(item ->
                        CalendarSchedule.Item.builder()
                                .name(item.getName())
                                .startTimes(item.getStartTimes())
                                .build())
                .toList();

        return CalendarSchedule.builder()
                .contentName(dto.getContentsName())
                .categoryName(dto.getCategoryName())
                .startTimes(dto.getStartTimes())
                .items(items)
                .build();
    }
}
