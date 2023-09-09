package com.example.spring_kpi_sem_5.controller;

import com.example.spring_kpi_sem_5.model.GameResult;
import com.example.spring_kpi_sem_5.service.GameResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/game-results")
public class GameResultController {

    @Autowired
    private GameResultService gameResultService;

    @GetMapping
    public List<GameResult> getAllGameResults() {
        return gameResultService.findAll();
    }

    @GetMapping("/{id}")
    public GameResult getGameResultById(@PathVariable Long id) {
        return gameResultService.findById(id);
    }

    @PostMapping
    public GameResult createGameResult(@RequestBody GameResult gameResult) {
        return gameResultService.save(gameResult);
    }

    @PutMapping("/{id}")
    public GameResult updateGameResult(@PathVariable Long id, @RequestBody GameResult gameResult) {
        gameResult.setId(id);
        return gameResultService.save(gameResult);
    }

    @DeleteMapping("/{id}")
    public void deleteGameResult(@PathVariable Long id) {
        gameResultService.deleteById(id);
    }
}
