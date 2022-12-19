package com.example.demo.controller.mapper;

import com.example.demo.controller.model.response.PlayerResponse;
import com.example.demo.model.Player;
import org.springframework.stereotype.Component;

@Component
public class PlayerRestMapper {
  public PlayerResponse toRest(Player domain) {
    return PlayerResponse.builder()
        .id(domain.getId())
        .name(domain.getName())
        .build();
  }
}
