package com.slcube.application.service;

import com.slcube.application.use_case.in.ProvideTravelIslandUseCase;
import com.slcube.application.use_case.out.TravelIslandInfoOutPort;
import com.slcube.model.TravelIsland;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@RequiredArgsConstructor
public class TravelIslandService implements ProvideTravelIslandUseCase {
    private final TravelIslandInfoOutPort outPort;


    @Override
    public List<TravelIsland> getTodayTravelIslandInfoList() {
        return outPort.fetchTravelIslandInfo(LocalDateTime.now());
    }
}
