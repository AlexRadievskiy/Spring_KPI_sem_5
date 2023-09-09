package com.example.spring_kpi_sem_5.repository;

import com.example.spring_kpi_sem_5.model.Team;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface TeamRepository {
    Team findById(Long id);
    List<Team> findAll();
    Team save(Team team);
    void deleteById(Long id);
}