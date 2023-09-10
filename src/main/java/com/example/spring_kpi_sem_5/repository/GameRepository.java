package com.example.spring_kpi_sem_5.repository;

import com.example.spring_kpi_sem_5.model.Game;
import java.util.List;

public interface GameRepository {
    Game findById(Long id);
    List<Game> findAll();
    Game save(Game game);
    void deleteById(Long id);
}
