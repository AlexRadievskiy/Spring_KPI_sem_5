package com.example.spring_kpi_sem_5.controller;

import com.example.spring_kpi_sem_5.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GameController {
    private final GameService gameService;

    @Autowired
    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    @GetMapping("/games")
    public String listGames(Model model) {
        model.addAttribute("games", gameService.findAll());
        return "games/list";
    }
}
