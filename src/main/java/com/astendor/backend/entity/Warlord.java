package com.astendor.backend.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "warlords", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"world_id", "user_id"})
})
public class Warlord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "world_id", nullable = false)
    private Integer worldId;

    @Column(name = "user_id", nullable = false)
    private Integer userId;

    @Column(name = "race_id", nullable = false)
    private Integer raceId;

    @Column(name = "x", nullable = false)
    private Integer x;

    @Column(name = "y", nullable = false)
    private Integer y;

    public Warlord() {
    }

    public Warlord(Integer worldId, Integer userId, Integer raceId, Integer x, Integer y) {
        this.worldId = worldId;
        this.userId = userId;
        this.raceId = raceId;
        this.x = x;
        this.y = y;
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

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getRaceId() {
        return raceId;
    }

    public void setRaceId(Integer raceId) {
        this.raceId = raceId;
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
}
