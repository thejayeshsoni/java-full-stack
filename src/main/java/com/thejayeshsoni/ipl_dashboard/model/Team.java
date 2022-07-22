package com.thejayeshsoni.ipl_dashboard.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String teamName;
    private long teamMatches;
    private long totalWins;

    @Transient
    private List<Match> matches;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public long getTeamMatches() {
        return teamMatches;
    }

    public void setTeamMatches(long teamMatches) {
        this.teamMatches = teamMatches;
    }

    public long getTotalWins() {
        return totalWins;
    }

    public void setTotalWins(long totalWins) {
        this.totalWins = totalWins;
    }

    public List<Match> getMatches() {
        return matches;
    }

    public void setMatches(List<Match> matches) {
        this.matches = matches;
    }

    public Team() {
    }

    public Team(String teamName, long teamMatches) {
        this.teamName = teamName;
        this.teamMatches = teamMatches;
    }

    @Override
    public String toString() {
        return "Team [teamMatches=" + teamMatches + ", teamName=" + teamName + ", totalWins=" + totalWins + "]";
    }
}
