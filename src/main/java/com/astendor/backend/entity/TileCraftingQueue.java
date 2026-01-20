package com.astendor.backend.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tile_crafting_queue")
public class TileCraftingQueue {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "world_id", nullable = false)
    private Integer worldId;

    @Column(name = "tile_id", nullable = false)
    private Integer tileId;

    @Column(name = "blueprint_id", nullable = false)
    private Integer blueprintId;

    @Column(name = "amount", nullable = false)
    private Integer amount;

    public TileCraftingQueue() {
    }

    public TileCraftingQueue(Integer worldId, Integer tileId, Integer blueprintId, Integer amount) {
        this.worldId = worldId;
        this.tileId = tileId;
        this.blueprintId = blueprintId;
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
