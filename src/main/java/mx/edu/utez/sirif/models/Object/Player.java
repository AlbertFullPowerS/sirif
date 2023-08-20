package mx.edu.utez.sirif.models.Object;

public class Player extends  User{
    private long id_player;
    private String playe6r_position;
    private String dorsal;
    private byte[] image_data;
    public Player(){}

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
