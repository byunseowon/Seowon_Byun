package com.chill.mallang.domain.war.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
//@Data
@Table(name="Area")
public class Area {
    @Id // 이 컬럼을 pk 지정
    @Column(name = "AREA_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY) // pk 생성규칙. 1씩 자동 증가
    private long id;

    @Column(name = "AREA_NAME", length = 30)
    private String name;

    @Column(name = "latitude")
    private float latitude;

    @Column(name = "longitude")
    private float longitude;
}