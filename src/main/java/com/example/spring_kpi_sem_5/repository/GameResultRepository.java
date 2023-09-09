package com.example.spring_kpi_sem_5.repository;

import com.example.spring_kpi_sem_5.model.GameResult;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface GameResultRepository {
    GameResult findById(Long id);
    List<GameResult> findAll();
    GameResult save(GameResult gameResult);
    void deleteById(Long id);
}
