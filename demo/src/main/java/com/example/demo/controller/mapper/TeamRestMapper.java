package com.example.demo.controller.mapper;

import com.example.demo.controller.model.response.TeamResponse;
import com.example.demo.model.Player;
import com.example.demo.model.Team;
import java.util.Comparator;
import java.util.stream.Collectors;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class TeamRestMapper {
  private final PlayerRestMapper playerMapper;

  public TeamResponse toRest(Team domain) {
    return TeamResponse.builder()
        .id(domain.getId())
        .name(domain.getName())
        .players(domain.getPlayers()
            .stream()
            .sorted(Comparator.comparingInt(Player::getNumber))
            .map(playerMapper::toRest).toList())
        .sponsors(domain.getSponsors())
        .build();
  }
}
