package com.example.demo.controller;

import com.example.demo.controller.mapper.PlayAgainstRestMapper;
import com.example.demo.controller.model.response.PlayAgainstResponse;
import com.example.demo.service.PlayAgainstService;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class PlayAgainstController {
  private final PlayAgainstService playAgainstService;
  private final PlayAgainstRestMapper playAgainstRestMapper;

  @GetMapping("/games")
  public List<PlayAgainstResponse> getTeams(@RequestParam("page") int page,
                                            @RequestParam("pageSize") int pageSize) {
    return playAgainstService.getAllPlayAgainst(page, pageSize)
        .stream().map(playAgainstRestMapper::toRest)
        .toList();
  }

}
