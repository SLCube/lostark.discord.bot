package com.slcube.model;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
public class CalendarSchedule {

    private final String contentName;
    private final String categoryName;
    private final List<LocalDateTime> startTimes;
    private final List<Item> items;

    @Builder
    private CalendarSchedule(String contentName, String categoryName, List<LocalDateTime> startTimes, List<Item> items) {
        this.contentName = contentName;
        this.categoryName = categoryName;
        this.startTimes = startTimes;
        this.items = items;
    }

    @Getter
    public static class Item {
        private final String name;
        private final List<LocalDateTime> startTimes;

        @Builder
        private Item(String name, List<LocalDateTime> startTimes) {
            this.name = name;
            this.startTimes = startTimes;
        }
    }
}
