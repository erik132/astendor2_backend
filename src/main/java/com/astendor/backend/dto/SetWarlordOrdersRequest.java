package com.astendor.backend.dto;

public class SetWarlordOrdersRequest {

    private Integer warlordId;
    private String orderText;

    public SetWarlordOrdersRequest() {
    }

    public SetWarlordOrdersRequest(Integer warlordId, String orderText) {
        this.warlordId = warlordId;
        this.orderText = orderText;
    }

    public Integer getWarlordId() {
        return warlordId;
    }

    public void setWarlordId(Integer warlordId) {
        this.warlordId = warlordId;
    }

    public String getOrderText() {
        return orderText;
    }

    public void setOrderText(String orderText) {
        this.orderText = orderText;
    }
}
