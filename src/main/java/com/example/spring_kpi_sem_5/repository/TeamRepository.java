package com.example.spring_kpi_sem_5.repository;

import com.example.spring_kpi_sem_5.model.Team;
import java.util.List;

public interface TeamRepository {
    Team findById(Long id);
    List<Team> findAll();
    Team save(Team team);
    void deleteById(Long id);
}