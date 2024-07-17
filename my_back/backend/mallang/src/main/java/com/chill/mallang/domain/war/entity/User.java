package com.chill.mallang.domain.war.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
//@Data
@Table(name="User")
public class User {
    @Id // 이 컬럼을 pk 지정
    @Column(name = "USER_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY) // pk 생성규칙. 1씩 자동 증가
    private long id;

    @Column(name = "USER_EMAIL", length = 100) // 길이제한 100
    private String email;

    @Column(name = "USER_NICKNAME")
    private float nickname;

    @ManyToOne
    @JoinColumn(name = "FACTION_ID") // Faction_id와 join함
    private Long faction_id;

    @Column(name = "USER_PICTURE", nullable = true) // null 가능
    private float longitude;

}

