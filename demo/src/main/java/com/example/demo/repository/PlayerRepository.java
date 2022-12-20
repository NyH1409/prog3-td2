package com.example.demo.repository;

import com.example.demo.model.Player;
import java.util.List;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Integer> {
  List<Player> findByTeamId(int teamId, Pageable pageable);
}
