package com.example.spring_kpi_sem_5.controllers;

import com.example.spring_kpi_sem_5.entities.Game;
import com.example.spring_kpi_sem_5.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.List;

@Controller
public class GameController {

    private final GameService gameService;

    @Autowired
    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    @GetMapping("/games")
    public String listGames(Model model) {
        List<Game> games = gameService.getAllGames();
        model.addAttribute("games", games);
        return "games/list"; // це шлях до вашого Thymeleaf шаблону
    }

    @GetMapping("/game")
    public String getGame(@RequestParam("date") Date date, Model model) {
        Game game = gameService.getGameByDate(date);
        model.addAttribute("game", game);
        return "games/detail"; // це шлях до вашого Thymeleaf шаблону
    }

    // Тут можуть бути інші методи, наприклад, для створення або оновлення ігор
}
