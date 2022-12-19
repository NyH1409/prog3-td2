package com.example.demo.controller;

import com.example.demo.controller.mapper.TeamRestMapper;
import com.example.demo.controller.model.response.TeamResponse;
import com.example.demo.service.TeamService;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class TeamController {
  private final TeamService teamService;
  private final TeamRestMapper teamRestMapper;

  @GetMapping("/teams")
  public List<TeamResponse> getTeams(@RequestParam("page") int page,
                                     @RequestParam("pageSize") int pageSize) {
    return teamService.getAllTeams(page, pageSize)
        .stream().map(teamRestMapper::toRest)
        .toList();
  }

}
