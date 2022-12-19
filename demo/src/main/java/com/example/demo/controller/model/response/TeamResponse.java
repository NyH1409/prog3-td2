package com.example.demo.controller.model.response;

import com.example.demo.model.Sponsor;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
public class TeamResponse {
  private int id;
  private String name;
  private List<PlayerResponse> players;
  private List<Sponsor> sponsors;
}
