package com.example.spring_kpi_sem_5.service;

import com.example.spring_kpi_sem_5.model.GameResult;
import com.example.spring_kpi_sem_5.repository.GameResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class GameResultService {

    @Autowired
    private GameResultRepository gameResultRepository;

    public GameResult findById(Long id) {
        return gameResultRepository.findById(id);
    }

    public List<GameResult> findAll() {
        return gameResultRepository.findAll();
    }

    public GameResult save(GameResult gameResult) {
        return gameResultRepository.save(gameResult);
    }

    public void deleteById(Long id) {
        gameResultRepository.deleteById(id);
    }
}
