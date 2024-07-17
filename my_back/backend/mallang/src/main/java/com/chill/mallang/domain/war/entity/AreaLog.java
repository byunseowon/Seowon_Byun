package com.chill.mallang.domain.war.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;

// 여기가 User-Area(N:M) 관계를 풀어주기 위한 연결테이블용 엔티티
@Entity
//@Data
@Table(name="AreaLog")
public class AreaLog {
    @Id // 이 컬럼을 pk 지정
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY) // pk 생성규칙. 1씩 자동 증가
    private Long id;

    @ManyToOne
    @JoinColumn(name = "USER_ID") // USER_ID와 join함
    private User user;

    @ManyToOne
    @JoinColumn(name = "AREA_ID")
    private Area area;

    @Column(name = "created_at")
    private Timestamp created_at;

    @Column(name = "score")
    private Float score;
}

