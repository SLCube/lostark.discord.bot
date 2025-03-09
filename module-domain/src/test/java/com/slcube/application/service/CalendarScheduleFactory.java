package com.slcube.application.service;

import com.slcube.model.CalendarSchedule;

import java.time.LocalDateTime;
import java.util.List;

public class CalendarScheduleFactory {

    public static List<CalendarSchedule> createLostArkCalendarSchedules() {
        return List.of(
                CalendarSchedule.builder()
                        .categoryName("로웬")
                        .contentName("[습격]리베르탄-[점령]-[습격]프라이겔리")
                        .startTimes(List.of(
                                LocalDateTime.of(2025, 3, 5, 22, 30, 0),
                                LocalDateTime.of(2025, 3, 7, 22, 30, 0),
                                LocalDateTime.of(2025, 3, 8, 20, 30, 0),
                                LocalDateTime.of(2025, 3, 9, 15, 30, 0),
                                LocalDateTime.of(2025, 3, 9, 22, 30, 0),
                                LocalDateTime.of(2025, 3, 11, 20, 30, 0)
                        ))
                        .items(List.of(
                                CalendarSchedule.Item.builder().name("실마엘 수정").startTimes(null).build(),
                                CalendarSchedule.Item.builder().name("로웬 세력 경험치").startTimes(null).build()
                        )).build(),
                CalendarSchedule.builder()
                        .categoryName("모험 섬")
                        .contentName("하모니 섬")
                        .startTimes(List.of(
                                LocalDateTime.of(2025, 3, 7, 11, 0, 0),
                                LocalDateTime.of(2025, 3, 7, 13, 0, 0),
                                LocalDateTime.of(2025, 3, 7, 19, 0, 0),
                                LocalDateTime.of(2025, 3, 7, 21, 0, 0),
                                LocalDateTime.of(2025, 3, 7, 23, 0, 0),
                                LocalDateTime.of(2025, 3, 9, 19, 0, 0),
                                LocalDateTime.of(2025, 3, 9, 21, 0, 0),
                                LocalDateTime.of(2025, 3, 9, 23, 0, 0)
                        ))
                        .items(List.of(
                                CalendarSchedule.Item.builder().name("하모니 섬의 마음").startTimes(null).build(),
                                CalendarSchedule.Item.builder().name("천상의 하모니").startTimes(null).build(),
                                CalendarSchedule.Item.builder().name("투명한 소리의 상자").startTimes(null).build(),
                                CalendarSchedule.Item.builder().name("향기로운 소리의 상자").startTimes(null).build(),
                                CalendarSchedule.Item.builder().name("조화로운 소리의 상자").startTimes(null).build(),
                                CalendarSchedule.Item.builder().name("실링").startTimes(null).build(),
                                CalendarSchedule.Item.builder().name("대양의 주화 상자").startTimes(null).build(),
                                CalendarSchedule.Item.builder().name("해적 주화").startTimes(null).build(),
                                CalendarSchedule.Item.builder().name("전설 ~ 고급 카드 팩 III").startTimes(
                                        List.of(
                                                LocalDateTime.of(2025, 3, 7, 11, 0, 0),
                                                LocalDateTime.of(2025, 3, 7, 13, 0, 0),
                                                LocalDateTime.of(2025, 3, 7, 19, 0, 0),
                                                LocalDateTime.of(2025, 3, 7, 21, 0, 0),
                                                LocalDateTime.of(2025, 3, 7, 23, 0, 0)
                                        )
                                ).build(),
                                CalendarSchedule.Item.builder().name("전설 ~ 고급 카드 팩 IV").startTimes(
                                        List.of(
                                                LocalDateTime.of(2025, 3, 7, 11, 0, 0),
                                                LocalDateTime.of(2025, 3, 7, 13, 0, 0),
                                                LocalDateTime.of(2025, 3, 7, 19, 0, 0),
                                                LocalDateTime.of(2025, 3, 7, 21, 0, 0),
                                                LocalDateTime.of(2025, 3, 7, 23, 0, 0)
                                        )
                                ).build(),
                                CalendarSchedule.Item.builder().name("영혼의 잎사귀").startTimes(
                                        List.of(
                                                LocalDateTime.of(2025, 3, 7, 11, 0, 0),
                                                LocalDateTime.of(2025, 3, 7, 13, 0, 0),
                                                LocalDateTime.of(2025, 3, 7, 19, 0, 0),
                                                LocalDateTime.of(2025, 3, 7, 21, 0, 0),
                                                LocalDateTime.of(2025, 3, 7, 23, 0, 0)
                                        )
                                ).build()
                        )).build(),
                CalendarSchedule.builder()
                        .categoryName("모험 섬")
                        .contentName("잔혹한 장난감 성")
                        .startTimes(List.of(
                                LocalDateTime.of(2025, 3, 8, 19, 0, 0),
                                LocalDateTime.of(2025, 3, 8, 21, 0, 0),
                                LocalDateTime.of(2025, 3, 8, 23, 0, 0)
                        ))
                        .items(List.of(
                                CalendarSchedule.Item.builder().name("잔혹한 장난감 성 섬의 마음").startTimes(null).build(),
                                CalendarSchedule.Item.builder().name("달콤살벌 마리오네트 변장도구").startTimes(null).build(),
                                CalendarSchedule.Item.builder().name("미로 정원 두근두근 상자").startTimes(null).build(),
                                CalendarSchedule.Item.builder().name("실링").startTimes(null).build(),
                                CalendarSchedule.Item.builder().name("골드").startTimes(
                                        List.of(
                                                LocalDateTime.of(2025, 3, 8, 19, 0, 0),
                                                LocalDateTime.of(2025, 3, 8, 21, 0, 0),
                                                LocalDateTime.of(2025, 3, 8, 23, 0, 0)
                                        )
                                ).build()
                        )).build()
        );
    }
}
