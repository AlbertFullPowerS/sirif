package mx.edu.utez.sirif.models.Object;

public class User {
    private long id_user;

    private String name;

    private String lastname;

    private String lastname2;


    private String user;
    private String password;
    private String role;
    public User()
    {

    }

    public User(long id_user, String name, String lastname, String lastname2, String user, String password, String role) {
        this.id_user = id_user;
        this.name = name;
        this.lastname = lastname;
        this.lastname2 = lastname2;
        this.user = user;
        this.password = password;
        this.role = role;
    }

    public long getId_user() {
        return id_user;
    }

    public void setId_user(long id_user) {
        this.id_user = id_user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getLastname2() {
        return lastname2;
    }

    public void setLastname2(String lastname2) {
        this.lastname2 = lastname2;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
