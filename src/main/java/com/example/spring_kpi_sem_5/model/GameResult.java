package com.example.spring_kpi_sem_5.model;

import java.util.Objects;

public class GameResult {
    private Long id; // Унікальний ідентифікатор
    private Game game; // Гра
    private int team1Score; // Результат для команди 1
    private int team2Score; // Результат для команди 2

    public GameResult() {
    }

    public GameResult(Long id, Game game, int team1Score, int team2Score) {
        this.id = id;
        this.game = game;
        this.team1Score = team1Score;
        this.team2Score = team2Score;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public int getTeam1Score() {
        return team1Score;
    }

    public void setTeam1Score(int team1Score) {
        this.team1Score = team1Score;
    }

    public int getTeam2Score() {
        return team2Score;
    }

    public void setTeam2Score(int team2Score) {
        this.team2Score = team2Score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GameResult that = (GameResult) o;
        return team1Score == that.team1Score &&
                team2Score == that.team2Score &&
                Objects.equals(id, that.id) &&
                Objects.equals(game, that.game);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, game, team1Score, team2Score);
    }

    @Override
    public String toString() {
        return "GameResult{" +
                "id=" + id +
                ", game=" + game +
                ", team1Score=" + team1Score +
                ", team2Score=" + team2Score +
                '}';
    }
}
