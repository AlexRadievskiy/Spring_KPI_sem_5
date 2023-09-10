package com.example.spring_kpi_sem_5.service;

import com.example.spring_kpi_sem_5.model.Team;
import com.example.spring_kpi_sem_5.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TeamService {
    private final TeamRepository teamRepository;

    @Autowired
    public TeamService(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    public Team findById(Long id) {
        return teamRepository.findById(id);
    }

    public List<Team> findAll() {
        return teamRepository.findAll();
    }

    public Team save(Team team) {
        return teamRepository.save(team);
    }

    public void deleteById(Long id) {
        teamRepository.deleteById(id);
    }
}
