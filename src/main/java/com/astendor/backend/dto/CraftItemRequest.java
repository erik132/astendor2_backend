package com.astendor.backend.dto;

public class CraftItemRequest {

    private Integer worldId;
    private Integer tileId;
    private Integer blueprintId;
    private Integer amount;

    public CraftItemRequest() {
    }

    public CraftItemRequest(Integer worldId, Integer tileId, Integer blueprintId, Integer amount) {
        this.worldId = worldId;
        this.tileId = tileId;
        this.blueprintId = blueprintId;
        this.amount = amount;
    }

    public Integer getWorldId() {
        return worldId;
    }

    public void setWorldId(Integer worldId) {
        this.worldId = worldId;
    }

    public Integer getTileId() {
        return tileId;
    }

    public void setTileId(Integer tileId) {
        this.tileId = tileId;
    }

    public Integer getBlueprintId() {
        return blueprintId;
    }

    public void setBlueprintId(Integer blueprintId) {
        this.blueprintId = blueprintId;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}
