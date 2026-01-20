package com.astendor.backend.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tile_training_queue")
public class TileTrainingQueue {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "world_id", nullable = false)
    private Integer worldId;

    @Column(name = "tile_id", nullable = false)
    private Integer tileId;

    @Column(name = "template_id", nullable = false)
    private Integer templateId;

    @Column(name = "amount", nullable = false)
    private Integer amount;

    public TileTrainingQueue() {
    }

    public TileTrainingQueue(Integer worldId, Integer tileId, Integer templateId, Integer amount) {
        this.worldId = worldId;
        this.tileId = tileId;
        this.templateId = templateId;
        this.amount = amount;
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
