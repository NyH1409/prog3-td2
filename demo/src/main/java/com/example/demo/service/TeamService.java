package com.example.demo.service;

import com.example.demo.model.Team;
import com.example.demo.repository.TeamRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TeamService {
  private final TeamRepository teamRepository;

  public List<Team> getAllTeams(int page, int pageSize) {
    Pageable pageable = PageRequest.of(page, pageSize);
    return teamRepository.findAll(pageable).toList();
  }

  public Optional<Team> getTeam(int id) {
    return teamRepository.findById(id);
  }

}
