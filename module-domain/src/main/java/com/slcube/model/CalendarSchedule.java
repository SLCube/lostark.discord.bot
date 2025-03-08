package com.slcube.model;

import lombok.Getter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
public class CalendarSchedule {

    private String islandName;
    private String rewardType;
    private List<LocalDateTime> startTimes;
}
