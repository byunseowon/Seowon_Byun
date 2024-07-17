package com.chill.mallang.domain.war.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Entity
//@Data
@Table(name="faction")
public class Faction {
    @Id
    @Column(name = "FACTION_ID")
    private Long id;

    @Column(name = "FACTION_NAME",length = 30)
    private String name;

    // Getter, Setter, Constructor
}