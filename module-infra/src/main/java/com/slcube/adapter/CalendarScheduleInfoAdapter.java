package com.slcube.adapter;

import com.slcube.application.use_case.out.CalendarScheduleInfoPort;
import com.slcube.config.LostArkApiProperties;
import com.slcube.dto.CalendarScheduleInfoDto;
import com.slcube.mapper.CalendarScheduleMapper;
import com.slcube.model.CalendarSchedule;
import lombok.RequiredArgsConstructor;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Objects;

@RequiredArgsConstructor
@Component
public class CalendarScheduleInfoAdapter implements CalendarScheduleInfoPort {

    private final RestTemplate restTemplate;
    private final LostArkApiProperties lostArkApiProperties;

    @Override
    public List<CalendarSchedule> fetchCalendarScheduleInfo() {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.set("Authorization", "Bearer " + lostArkApiProperties.getKey());

        HttpEntity<?> request = new HttpEntity<>(httpHeaders);
        ResponseEntity<List<CalendarScheduleInfoDto>> result = restTemplate.exchange(lostArkApiProperties.getUrl(), HttpMethod.GET, request, new ParameterizedTypeReference<>() {
        });

        return Objects.requireNonNull(result.getBody()).stream()
                .map(CalendarScheduleMapper::toDomain)
                .toList();
    }
}
