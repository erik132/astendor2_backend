package com.astendor.backend.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

import java.util.List;

@Entity
@Immutable
@Table(name = "world_tiles_info")
public class WorldTilesInfo {

    @Id
    @Column(name = "tile_id")
    private Integer tileId;

    @Column(name = "world_id")
    private Integer worldId;

    @Column(name = "x")
    private Integer x;

    @Column(name = "y")
    private Integer y;

    @Column(name = "tile_name")
    private String tileName;

    @Column(name = "terrain_name")
    private String terrainName;

    @Column(name = "race_name")
    private String raceName;

    @OneToMany
    @JoinColumn(name = "tile_id", referencedColumnName = "tile_id", insertable = false, updatable = false)
    private List<WorldTileHarvestInfo> harvestInfoList;

    public WorldTilesInfo() {
    }

    public Integer getTileId() {
        return tileId;
    }

    public void setTileId(Integer tileId) {
        this.tileId = tileId;
    }

    public Integer getWorldId() {
        return worldId;
    }

    public void setWorldId(Integer worldId) {
        this.worldId = worldId;
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public String getTileName() {
        return tileName;
    }

    public void setTileName(String tileName) {
        this.tileName = tileName;
    }

    public String getTerrainName() {
        return terrainName;
    }

    public void setTerrainName(String terrainName) {
        this.terrainName = terrainName;
    }

    public String getRaceName() {
        return raceName;
    }

    public void setRaceName(String raceName) {
        this.raceName = raceName;
    }

    public List<WorldTileHarvestInfo> getHarvestInfoList() {
        return harvestInfoList;
    }

    public void setHarvestInfoList(List<WorldTileHarvestInfo> harvestInfoList) {
        this.harvestInfoList = harvestInfoList;
    }
}
