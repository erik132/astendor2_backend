package com.astendor.backend.dto;

public class JoinWorldRequest {

    private Integer worldId;
    private Integer raceId;

    public JoinWorldRequest() {
    }

    public JoinWorldRequest(Integer worldId, Integer raceId) {
        this.worldId = worldId;
        this.raceId = raceId;
    }

    public Integer getWorldId() {
        return worldId;
    }

    public void setWorldId(Integer worldId) {
        this.worldId = worldId;
    }

    public Integer getRaceId() {
        return raceId;
    }

    public void setRaceId(Integer raceId) {
        this.raceId = raceId;
    }
}
