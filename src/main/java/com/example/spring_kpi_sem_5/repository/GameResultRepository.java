package com.example.spring_kpi_sem_5.repository;

import com.example.spring_kpi_sem_5.model.GameResult;
import java.util.List;

public interface GameResultRepository {
    GameResult findById(Long id);
    List<GameResult> findAll();
    GameResult save(GameResult gameResult);
    void deleteById(Long id);
}
