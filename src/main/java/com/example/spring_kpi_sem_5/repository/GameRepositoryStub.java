package com.example.spring_kpi_sem_5.repository;

import com.example.spring_kpi_sem_5.model.Game;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class GameRepositoryStub implements GameRepository {
    private final List<Game> games = new ArrayList<>();

    @Override
    public Game findById(Long id) {
        return games.stream().filter(game -> game.getId().equals(id)).findFirst().orElse(null);
    }

    @Override
    public List<Game> findAll() {
        return new ArrayList<>(games);
    }

    @Override
    public Game save(Game game) {
        games.add(game);
        return game;
    }

    @Override
    public void deleteById(Long id) {
        games.removeIf(game -> game.getId().equals(id));
    }
}
