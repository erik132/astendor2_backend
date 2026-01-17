package com.astendor.backend.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "warlord_orders")
public class WarlordOrders {

    @Id
    @Column(name = "warlord_id", nullable = false)
    private Integer warlordId;

    @Column(name = "order_text", nullable = false, columnDefinition = "TEXT")
    private String orderText;

    public WarlordOrders() {
    }

    public WarlordOrders(Integer warlordId, String orderText) {
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
