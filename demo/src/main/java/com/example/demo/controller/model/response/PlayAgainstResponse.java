package com.example.demo.controller.model.response;

import java.time.Instant;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
public class PlayAgainstResponse {
  private String firstTeam;
  private String secondTeam;
  private Instant date;
}
