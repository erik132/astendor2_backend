package com.astendor.backend.dto;

public class TrainUnitRequest {

    private Integer worldId;
    private Integer tileId;
    private Integer templateId;
    private Integer amount;

    public TrainUnitRequest() {
    }

    public TrainUnitRequest(Integer worldId, Integer tileId, Integer templateId, Integer amount) {
        this.worldId = worldId;
        this.tileId = tileId;
        this.templateId = templateId;
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

    public Integer getTemplateId() {
        return templateId;
    }

    public void setTemplateId(Integer templateId) {
        this.templateId = templateId;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}
