package mx.edu.utez.sirif.models.Object;

public class Matchday {
    private long id_matchday;
    private String match_field;
    private int points;


    private int draws;

    private int wins;
    private int loses;
    private int goal_difference;
    public Matchday(){

    }

    public Matchday(long id_matchday, String match_field, int points, int draws, int wins, int loses, int goal_difference) {
        this.id_matchday = id_matchday;
        this.match_field = match_field;
        this.points = points;
        this.draws = draws;
        this.wins = wins;
        this.loses = loses;
        this.goal_difference = goal_difference;
    }

    public long getId_matchday() {
        return id_matchday;
    }

    public void setId_matchday(long id_matchday) {
        this.id_matchday = id_matchday;
    }

    public String getMatch_field() {
        return match_field;
    }

    public void setMatch_field(String match_field) {
        this.match_field = match_field;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getDraws() {
        return draws;
    }

    public void setDraws(int draws) {
        this.draws = draws;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getLoses() {
        return loses;
    }

    public void setLoses(int loses) {
        this.loses = loses;
    }

    public int getGoal_difference() {
        return goal_difference;
    }

    public void setGoal_difference(int goal_difference) {
        this.goal_difference = goal_difference;
    }
}
