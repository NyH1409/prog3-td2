package com.example.demo.controller.mapper;

import com.example.demo.controller.model.response.PlayAgainstResponse;
import com.example.demo.controller.model.response.PlayerResponse;
import com.example.demo.model.PlayAgainst;
import com.example.demo.model.Player;
import org.springframework.stereotype.Component;

@Component
public class PlayAgainstRestMapper {
  public PlayAgainstResponse toRest(PlayAgainst domain) {
    return PlayAgainstResponse.builder()
        .firstTeam(domain.getFirstTeam().getName())
        .secondTeam(domain.getSecondTeam().getName())
        .date(domain.getDatetime())
        .build();
  }
}
