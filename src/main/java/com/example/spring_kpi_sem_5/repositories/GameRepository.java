package com.example.spring_kpi_sem_5.repositories;

import com.example.spring_kpi_sem_5.entities.Game;
import java.util.List;
import java.util.Date;

public interface GameRepository {
    List<Game> findAll();
    List<Game> findByDate(Date date);
    // можливо, інші методи, які вам знадобляться для взаємодії з даними ігор
}
