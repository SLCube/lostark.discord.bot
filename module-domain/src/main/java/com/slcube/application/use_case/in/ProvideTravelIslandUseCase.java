package com.slcube.application.use_case.in;

import com.slcube.model.TravelIsland;

import java.util.List;

public interface ProvideTravelIslandUseCase {

    List<TravelIsland> getTodayTravelIslandInfoList();
}
