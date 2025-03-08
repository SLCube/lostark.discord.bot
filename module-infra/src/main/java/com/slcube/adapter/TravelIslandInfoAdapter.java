package com.slcube.adapter;

import com.slcube.application.use_case.out.TravelIslandInfoOutPort;
import com.slcube.model.TravelIsland;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDateTime;
import java.util.List;

public class TravelIslandInfoAdapter implements TravelIslandInfoOutPort {

    private final RestTemplate restTemplate;

    public TravelIslandInfoAdapter(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public List<TravelIsland> fetchTravelIslandInfo(LocalDateTime targetDate) {
        return List.of();
    }
}
