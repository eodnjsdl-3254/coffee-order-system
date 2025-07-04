package com.sparta.tdd.coffeeshop.domain.menu.dto;

import com.sparta.tdd.coffeeshop.domain.menu.Menu;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder // Builder 패턴으로 객체 생성
public class MenuResponse {
    private Long id;
    private String menuName;
    private int price;

    // Menu 엔티티로부터 MenuResponse 객체를 생성하는 팩토리 메서드
    public static MenuResponse from(Menu menu) {
        return MenuResponse.builder()
                .id(menu.getId())
                .menuName(menu.getName())
                .price(menu.getPrice())
                .build();
    }
}