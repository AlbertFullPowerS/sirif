package mx.edu.utez.sirif.models.Object;

public class Team {
    private long id_team;
    private String name_team;
    private int members;
    private Matchday matchday;
    private byte[] imagen_data;

    public long getId_team() {
        return id_team;
    }

    public void setId_team(long id_team) {
        this.id_team = id_team;
    }

    public String getName_team() {
        return name_team;
    }

    public void setName_team(String name_team) {
        this.name_team = name_team;
    }

    public int getMembers() {
        return members;
    }

    public void setMembers(int members) {
        this.members = members;
    }

    public Matchday getMatchday() {
        return matchday;
    }

    public void setMatchday(Matchday matchday) {
        this.matchday = matchday;
    }

    public byte[] getImagen_data() {
        return imagen_data;
    }

    public void setImagen_data(byte[] imagen_data) {
        this.imagen_data = imagen_data;
    }
    public Team(){

    }
    public Team(long id_team, String name_team, int members, Matchday matchday, byte[] imagen_data) {
        this.id_team = id_team;
        this.name_team = name_team;
        this.members = members;
        this.matchday = matchday;
        this.imagen_data = imagen_data;
    }




}
