package com.example.spring_kpi_sem_5.repository;

import com.example.spring_kpi_sem_5.model.Team;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class TeamRepositoryStub implements TeamRepository {
    private final List<Team> teams = new ArrayList<>();

    @Override
    public Team findById(Long id) {
        return teams.stream().filter(team -> team.getId().equals(id)).findFirst().orElse(null);
    }

    @Override
    public List<Team> findAll() {
        return new ArrayList<>(teams);
    }

    @Override
    public Team save(Team team) {
        teams.add(team);
        return team;
    }

    @Override
    public void deleteById(Long id) {
        teams.removeIf(team -> team.getId().equals(id));
    }
}
