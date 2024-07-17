package com.chill.mallang.domain.war.service;

import com.chill.mallang.domain.war.entity.Area;
import com.chill.mallang.domain.war.repository.WarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WarService {
    @Autowired // 의존성 주입 어노테이션
    private WarRepository warRepository;

    // 점령지 전체 찾기(필요함?)
    public List<Area> getAllAreas(){
        return warRepository.findAll();
    }

    // 점령지 하나만 찾기
    public Area getAreaById(Long id){
        return warRepository.findById(id).orElse(null);
        // orElse(null)없으면 오류남
        // -> 값이 없을 수도 있는 Optional객체를 반환하기 때
    }
}
