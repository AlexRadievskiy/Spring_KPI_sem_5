package com.example.spring_kpi_sem_5.repositories;

import com.example.spring_kpi_sem_5.entities.Team;
import java.util.List;

public interface TeamRepository {
    List<Team> findAll();
    Team findByName(String name);
    // можливо, інші методи, які вам знадобляться для взаємодії з даними команд
}
