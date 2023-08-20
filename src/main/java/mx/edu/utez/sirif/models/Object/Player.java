package mx.edu.utez.sirif.models.Object;

public class Player extends  User{
    private long id_player;
    private String playe6r_position;
    private String dorsal;
    private  Team team;
    private byte[] image_data;
    public Player(){}


    public long getId_player() {
        return id_player;
    }

    public void setId_player(long id_player) {
        this.id_player = id_player;
    }

    public String getPlaye6r_position() {
        return playe6r_position;
    }

    public void setPlaye6r_position(String playe6r_position) {
        this.playe6r_position = playe6r_position;
    }

    public String getDorsal() {
        return dorsal;
    }

    public void setDorsal(String dorsal) {
        this.dorsal = dorsal;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public byte[] getImage_data() {
        return image_data;
    }

    public void setImage_data(byte[] image_data) {
        this.image_data = image_data;
    }

    public Player(long id_player, String playe6r_position, String dorsal, byte[] image_data) {
        this.id_player = id_player;
        this.playe6r_position = playe6r_position;
        this.dorsal = dorsal;
        this.image_data = image_data;
    }

    public Player(long id_user, String name, String lastname, String lastname2, String user, String password, String role, long id_player, String playe6r_position, String dorsal, byte[] image_data) {
        super(id_user, name, lastname, lastname2, user, password, role);
        this.id_player = id_player;
        this.playe6r_position = playe6r_position;
        this.dorsal = dorsal;
        this.image_data = image_data;
    }
}
