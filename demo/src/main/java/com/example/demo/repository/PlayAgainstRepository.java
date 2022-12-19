package com.example.demo.repository;

import com.example.demo.model.PlayAgainst;
import com.example.demo.model.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayAgainstRepository extends JpaRepository<PlayAgainst, Integer> {
}
