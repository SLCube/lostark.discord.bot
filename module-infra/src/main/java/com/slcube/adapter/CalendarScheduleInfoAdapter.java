package com.slcube.adapter;

import com.slcube.application.use_case.out.CalendarScheduleInfoOutPort;
import com.slcube.dto.CalendarScheduleInfoDto;
import com.slcube.model.CalendarSchedule;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RequiredArgsConstructor
@Component
public class CalendarScheduleInfoAdapter implements CalendarScheduleInfoOutPort {

    private final RestTemplate restTemplate;

    @Value("${lostark.api.key}")
    private String apiKey;

    @Value("${lostark.api.url}")
    private String apiUrl;

    @Override
    public List<CalendarSchedule> fetchCalendarScheduleInfo() {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.set("Authorization", "Bearer " + apiKey);

        HttpEntity<?> request = new HttpEntity<>(httpHeaders);
        ResponseEntity<List<CalendarScheduleInfoDto>> result = restTemplate.exchange(apiUrl, HttpMethod.GET, request, new ParameterizedTypeReference<>() {
        });
//        return result.getBody();
        return List.of();
    }
}
