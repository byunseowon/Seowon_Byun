package com.chill.mallang.domain.war.repository;

import com.chill.mallang.domain.war.entity.Area;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WarRepository extends JpaRepository<Area,Long> {
}

// db를 조작하는 함수 정의해두는 곳...
// 기본적인 find,delete... 등은 된다고 함