package com.slcube.model;

import lombok.Getter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
public class CalendarSchedule {

    private String contentName;
    private String rewardType;
    private String categoryName;
    private List<LocalDateTime> startTimes;
}
