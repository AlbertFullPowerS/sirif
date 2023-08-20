package mx.edu.utez.sirif.models.Object;

public class Representatives extends  User{
    private long id_rep;
    private String num_phone;
    private Team teams;

    public long getId_rep() {
        return id_rep;
    }

    public void setId_rep(long id_rep) {
        this.id_rep = id_rep;
    }

    public String getNum_phone() {
        return num_phone;
    }

    public void setNum_phone(String num_phone) {
        this.num_phone = num_phone;
    }

    public Team getTeams() {
        return teams;
    }

    public void setTeams(Team teams) {
        this.teams = teams;
    }
    public Representatives(){

    }

    public Representatives(long id_rep, String num_phone, Team teams) {
        this.id_rep = id_rep;
        this.num_phone = num_phone;
        this.teams = teams;
    }
}
