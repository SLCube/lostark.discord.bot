package com.slcube.application.use_case.out;

import com.slcube.model.TravelIsland;

import java.time.LocalDateTime;
import java.util.List;

public interface TravelIslandInfoOutPort {
    List<TravelIsland> fetchTravelIslandInfo(LocalDateTime targetDate);
}
