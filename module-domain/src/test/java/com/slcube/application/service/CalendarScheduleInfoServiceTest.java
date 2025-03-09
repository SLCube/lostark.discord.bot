package com.slcube.application.service;

import com.slcube.application.use_case.out.CalendarScheduleInfoPort;
import com.slcube.model.CalendarSchedule;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;
import java.util.List;

import static com.slcube.application.service.CalendarScheduleFactory.createLostArkCalendarSchedules;
import static org.assertj.core.api.Assertions.assertThat;


@ExtendWith(MockitoExtension.class)
class CalendarScheduleInfoServiceTest {

    @InjectMocks
    private CalendarScheduleInfoService calendarScheduleInfoService;

    @Mock
    private CalendarScheduleInfoPort outPort;

    @Test
    @DisplayName("로스트아크 캘린더 스케줄 컨텐츠 중 모험섬 일정만 추출 테스트")
    void getTravelIslandInfoListByTargetDateTest() {
        BDDMockito.given(outPort.fetchCalendarScheduleInfo()).willReturn(createLostArkCalendarSchedules());

        List<CalendarSchedule> travelIslandInfoListByTargetDate = calendarScheduleInfoService.getTravelIslandInfoListByTargetDate(LocalDate.of(2025, 3, 8));
        
        assertThat(travelIslandInfoListByTargetDate).hasSize(1);
        CalendarSchedule travelIslandInfo = travelIslandInfoListByTargetDate.get(0);

        assertThat(travelIslandInfo.getContentName()).isEqualTo("잔혹한 장난감 성");
        assertThat(travelIslandInfo.getCategoryName()).isEqualTo("모험 섬");
        assertThat(travelIslandInfo.getItems().stream()
                .filter(item -> item.getStartTimes() != null && !item.getStartTimes().isEmpty())
                .findFirst()
                .orElseThrow(IllegalStateException::new)
                .getName())
                .isEqualTo("골드");
    }
}