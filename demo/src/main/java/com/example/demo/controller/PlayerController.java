package com.example.demo.controller;

import com.example.demo.controller.mapper.PlayerRestMapper;
import com.example.demo.controller.model.response.PlayerResponse;
import com.example.demo.service.PlayerService;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class PlayerController {
  private final PlayerService playerService;
  private final PlayerRestMapper playerRestMapper;

  @GetMapping("/teams/{tId}/players")
  public List<PlayerResponse> getTeams(
      @RequestParam("page") int page,
      @RequestParam("pageSize") int pageSize,
      @PathVariable("tId") int teamId) {
    return playerService.getAllPlayers(page, pageSize, teamId)
        .stream().map(playerRestMapper::toRest)
        .toList();
  }

}
