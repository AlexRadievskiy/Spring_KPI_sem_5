package com.example.spring_kpi_sem_5.controller;

import com.example.spring_kpi_sem_5.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TeamController {
    private final TeamService teamService;

    @Autowired
    public TeamController(TeamService teamService) {
        this.teamService = teamService;
    }

    @GetMapping("/teams")
    public String listTeams(Model model) {
        model.addAttribute("teams", teamService.findAll());
        return "teams/list";
    }
}
