package com.example.demo.service;

import com.example.demo.model.PlayAgainst;
import com.example.demo.repository.PlayAgainstRepository;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PlayAgainstService {
  private final PlayAgainstRepository playAgainstRepository;

  public List<PlayAgainst> getAllPlayAgainst(int page, int pageSize) {
    Pageable pageable = PageRequest.of(page, pageSize);
    return playAgainstRepository.findAll(pageable).toList();
  }

}
