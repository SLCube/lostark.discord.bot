package com.slcube.model;

import com.slcube.enums.TravelIslandTimeType;
import lombok.Getter;

@Getter
public class TravelIsland {

    private String islandName;
    private String rewardType;
    private TravelIslandTimeType timeType;
}
