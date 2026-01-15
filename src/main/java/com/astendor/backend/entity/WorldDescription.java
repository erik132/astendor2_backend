package com.astendor.backend.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "world_description")
public class WorldDescription {

    @Id
    @Column(name = "world_id")
    private Integer worldId;

    @Column(name = "world_name")
    private String worldName;

    @Column(name = "harvest_multiplier")
    private Double harvestMultiplier;

    @Column(name = "turn_nr")
    private Integer turnNr;

    @Column(name = "xdim")
    private Integer xdim;

    @Column(name = "ydim")
    private Integer ydim;

    @Column(name = "map_name")
    private String mapName;

    @Column(name = "map_description")
    private String mapDescription;

    public WorldDescription() {
    }

    public Integer getWorldId() {
        return worldId;
    }

    public void setWorldId(Integer worldId) {
        this.worldId = worldId;
    }

    public String getWorldName() {
        return worldName;
    }

    public void setWorldName(String worldName) {
        this.worldName = worldName;
    }

    public Double getHarvestMultiplier() {
        return harvestMultiplier;
    }

    public void setHarvestMultiplier(Double harvestMultiplier) {
        this.harvestMultiplier = harvestMultiplier;
    }

    public Integer getTurnNr() {
        return turnNr;
    }

    public void setTurnNr(Integer turnNr) {
        this.turnNr = turnNr;
    }

    public Integer getXdim() {
        return xdim;
    }

    public void setXdim(Integer xdim) {
        this.xdim = xdim;
    }

    public Integer getYdim() {
        return ydim;
    }

    public void setYdim(Integer ydim) {
        this.ydim = ydim;
    }

    public String getMapName() {
        return mapName;
    }

    public void setMapName(String mapName) {
        this.mapName = mapName;
    }

    public String getMapDescription() {
        return mapDescription;
    }

    public void setMapDescription(String mapDescription) {
        this.mapDescription = mapDescription;
    }
}
