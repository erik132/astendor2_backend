package com.astendor.backend.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "tile_training_queue_info")
public class TileTrainingQueueInfo {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "world_id")
    private Integer worldId;

    @Column(name = "tile_id")
    private Integer tileId;

    @Column(name = "amount")
    private Integer amount;

    @Column(name = "name")
    private String name;

    public TileTrainingQueueInfo() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
