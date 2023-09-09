package com.example.spring_kpi_sem_5.controller;

import com.example.spring_kpi_sem_5.model.Game;
import com.example.spring_kpi_sem_5.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<Game> getAllGames() {
        return gameService.findAll();
    }

    @GetMapping("/{id}")
    public Game getGameById(@PathVariable Long id) {
        return gameService.findById(id);
    }

    @PostMapping
    public Game createGame(@RequestBody Game game) {
        return gameService.save(game);
    }

    @PutMapping("/{id}")
    public Game updateGame(@PathVariable Long id, @RequestBody Game game) {
        game.setId(id);
        return gameService.save(game);
    }

    @DeleteMapping("/{id}")
    public void deleteGame(@PathVariable Long id) {
        gameService.deleteById(id);
    }
}
