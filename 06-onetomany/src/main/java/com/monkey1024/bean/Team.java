package com.monkey1024.bean;

import java.util.List;

public class Team {

    private int id;

    private String name;

    private List<Player> players;

    public Team() {
    }

    public Team(int id, String name, List<Player> players) {
        this.id = id;
        this.name = name;
        this.players = players;
    }

    @Override
    public String toString() {
        return "Team{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", players=" + players +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }
}
