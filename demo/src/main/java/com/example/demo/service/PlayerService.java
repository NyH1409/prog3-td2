package com.example.demo.service;

import com.example.demo.model.PlayAgainst;
import com.example.demo.model.Player;
import com.example.demo.model.Team;
import com.example.demo.repository.PlayAgainstRepository;
import com.example.demo.repository.PlayerRepository;
import java.util.List;
import java.util.Optional;
import javax.persistence.OrderBy;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PlayerService {
  private final PlayerRepository playerRepository;

  public List<Player> getAllPlayers(int page, int pageSize, int teamId) {
    Pageable pageable = PageRequest.of(page, pageSize, Sort.by(Sort.Direction.ASC, "number"));
    return playerRepository.findByTeamId(teamId, pageable);
  }

}
