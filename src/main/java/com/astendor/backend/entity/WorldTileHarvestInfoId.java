package com.astendor.backend.entity;

import java.io.Serializable;
import java.util.Objects;

public class WorldTileHarvestInfoId implements Serializable {
    private Integer tileId;
    private Integer itemId;

    public WorldTileHarvestInfoId() {
    }

    public WorldTileHarvestInfoId(Integer tileId, Integer itemId) {
        this.tileId = tileId;
        this.itemId = itemId;
    }

    public Integer getTileId() {
        return tileId;
    }

    public void setTileId(Integer tileId) {
        this.tileId = tileId;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WorldTileHarvestInfoId that = (WorldTileHarvestInfoId) o;
        return Objects.equals(tileId, that.tileId) &&
                Objects.equals(itemId, that.itemId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tileId, itemId);
    }
}
