package com.example.demo.service;

import com.example.demo.model.PlayAgainst;
import com.example.demo.model.Player;
import com.example.demo.model.Team;
import com.example.demo.repository.PlayAgainstRepository;
import com.example.demo.repository.PlayerRepository;
import java.util.List;
import java.util.Optional;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PlayerService {
  private final PlayerRepository playerRepository;
  private final TeamService teamService;

  public List<Player> getAllPlayers(int teamId) {
    Optional<Team> team = teamService.getTeam(teamId);
    if (team.isPresent()){
      return team.get().getPlayers();
    }
    throw new RuntimeException("Team not found");
  }

}
