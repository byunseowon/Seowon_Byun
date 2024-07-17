package com.chill.mallang.domain.war.controller;

import com.chill.mallang.domain.war.entity.Area;
import com.chill.mallang.domain.war.service.WarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/areas")
public class WarController {
    @Autowired
    private WarService warService;

    // 모든 점령지
    @GetMapping
    public List<Area> getAllUsers() {
        return warService.getAllAreas();
    }

    // 특정 점령지
    @GetMapping("/{id}")
    public Area getUserById(@PathVariable Long id) {
        return warService.getAreaById(id);
    }
}
