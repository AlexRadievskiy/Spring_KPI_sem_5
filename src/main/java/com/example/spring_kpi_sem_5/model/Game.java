package com.example.spring_kpi_sem_5.model;

import java.util.Date;
import java.util.Objects;

public class Game {
    private Long id; // Унікальний ідентифікатор
    private Date date; // Дата гри
    private Team team1; // Перша команда
    private Team team2; // Друга команда

    public Game() {
    }

    public Game(Long id, Date date, Team team1, Team team2) {
        this.id = id;
        this.date = date;
        this.team1 = team1;
        this.team2 = team2;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Team getTeam1() {
        return team1;
    }

    public void setTeam1(Team team1) {
        this.team1 = team1;
    }

    public Team getTeam2() {
        return team2;
    }

    public void setTeam2(Team team2) {
        this.team2 = team2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Game game = (Game) o;
        return Objects.equals(id, game.id) &&
                Objects.equals(date, game.date) &&
                Objects.equals(team1, game.team1) &&
                Objects.equals(team2, game.team2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, date, team1, team2);
    }

    @Override
    public String toString() {
        return "Game{" +
                "id=" + id +
                ", date=" + date +
                ", team1=" + team1 +
                ", team2=" + team2 +
                '}';
    }
}
