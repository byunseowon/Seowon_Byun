package com.chill.mallang.domain.war.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;


@Entity
//@Data
@Table(name="faction")
public class Faction {
    @Id
    @Column(name = "FACTION_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "FACTION_NAME",length = 30)
    private String name;

    @OneToMany(mappedBy = "faction", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<User> users;

    // Getter, Setter, Constructor
}