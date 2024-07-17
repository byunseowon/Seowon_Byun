package com.chill.mallang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableCaching // 캐싱 어노테이션 인식 가능
@EnableScheduling // 스케줄링 어노테이션 인식 가능
public class MallangApplication {

	public static void main(String[] args) {
		SpringApplication.run(MallangApplication.class, args);
	}

}
