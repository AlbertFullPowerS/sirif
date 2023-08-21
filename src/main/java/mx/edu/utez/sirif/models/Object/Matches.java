package mx.edu.utez.sirif.models.Object;

import java.util.Date;

public class Matches {
    private long id_matches;
    private String start_hour;
    private String end_hour;
    private int goals_scored;
    private int goals_against;
    private String date_match;
    private Matchday matchday;
    private Team team;
    private Team team1;
    public Matches(){

    }

    public Matches(long id_matches, String start_hour, String end_hour, int goals_scored, int goals_against, String date_match, Matchday matchday, Team team, Team team1) {
        this.id_matches = id_matches;
        this.start_hour = start_hour;
        this.end_hour = end_hour;
        this.goals_scored = goals_scored;
        this.goals_against = goals_against;
        this.date_match = date_match;
        this.matchday = matchday;
        this.team = team;
        this.team1 = team1;
    }

    public long getId_matches() {
        return id_matches;
    }

    public void setId_matches(long id_matches) {
        this.id_matches = id_matches;
    }

    public String getStart_hour() {
        return start_hour;
    }

    public void setStart_hour(String start_hour) {
        this.start_hour = start_hour;
    }

    public String getEnd_hour() {
        return end_hour;
    }

    public void setEnd_hour(String end_hour) {
        this.end_hour = end_hour;
    }

    public int getGoals_scored() {
        return goals_scored;
    }

    public void setGoals_scored(int goals_scored) {
        this.goals_scored = goals_scored;
    }

    public int getGoals_against() {
        return goals_against;
    }

    public void setGoals_against(int goals_against) {
        this.goals_against = goals_against;
    }

    public String getDate_match() {
        return date_match;
    }

    public void setDate_match(String date_match) {
        this.date_match = date_match;
    }

    public Matchday getMatchday() {
        return matchday;
    }

    public void setMatchday(Matchday matchday) {
        this.matchday = matchday;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public Team getTeam1() {
        return team1;
    }

    public void setTeam1(Team team1) {
        this.team1 = team1;
    }
}
