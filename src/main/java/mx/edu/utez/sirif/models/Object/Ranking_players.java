package mx.edu.utez.sirif.models.Object;

public class Ranking_players {
    private int id_ranking;
    private int red_card;
    private int yel_card;
    private int goals;
    private int assistences;
    private Player player;
    public Ranking_players(){

    }

    public Ranking_players(int id_ranking, int red_card, int yel_card, int goals, int assistences, Player player) {
        this.id_ranking = id_ranking;
        this.red_card = red_card;
        this.yel_card = yel_card;
        this.goals = goals;
        this.assistences = assistences;
        this.player = player;
    }

    public int getId_ranking() {
        return id_ranking;
    }

    public void setId_ranking(int id_ranking) {
        this.id_ranking = id_ranking;
    }

    public int getRed_card() {
        return red_card;
    }

    public void setRed_card(int red_card) {
        this.red_card = red_card;
    }

    public int getYel_card() {
        return yel_card;
    }

    public void setYel_card(int yel_card) {
        this.yel_card = yel_card;
    }

    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    public int getAssistences() {
        return assistences;
    }

    public void setAssistences(int assistences) {
        this.assistences = assistences;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
}
