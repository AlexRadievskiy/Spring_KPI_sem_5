package com.example.spring_kpi_sem_5.services;

import com.example.spring_kpi_sem_5.entities.Game;
import com.example.spring_kpi_sem_5.entities.GameResult;
import com.example.spring_kpi_sem_5.repositories.GameRepository;
import com.example.spring_kpi_sem_5.repositories.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Date;

@Service
public class GameService {

    private final GameRepository gameRepository;
    private final TeamRepository teamRepository;

    @Autowired
    public GameService(GameRepository gameRepository, TeamRepository teamRepository) {
        this.gameRepository = gameRepository;
        this.teamRepository = teamRepository;
    }

    public List<Game> getAllGames() {
        return gameRepository.findAll();
    }

    public Game getGameByDate(Date date) {
        // тут може бути логіка для пошуку гри за конкретною датою
        return null; // замініть це реальною реалізацією
    }

    public void saveGameResult(GameResult gameResult) {
        // тут може бути логіка для збереження результатів гри
    }

    // можливо, інші методи, які вам знадобляться для реалізації бізнес-логіки
}
