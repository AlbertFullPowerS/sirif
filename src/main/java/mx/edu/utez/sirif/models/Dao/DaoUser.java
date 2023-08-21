package mx.edu.utez.sirif.models.Dao;

import mx.edu.utez.sirif.models.Object.Representatives;
import mx.edu.utez.sirif.models.Object.User;
import mx.edu.utez.sirif.utils.MySQLConnection;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DaoUser {
    private Connection conn;//Coneccion

    private PreparedStatement pstm; //Es domnde nosotros preparamos la sentencia sql y se pueda leer del lado del sql

    private ResultSet rs ;
    private CallableStatement call;

    public User login(String email , String password) {
        User user = null;

        System.out.println(email + " " + password);
        try {

            conn = new MySQLConnection().connect(); // Coneccion a la base de datos
            String query = "CALL login(?,?,'193d82685febb9c03e6cbb64919212b20cf7296198c7ed2730a7bfb5867d4b43');";//Cosulta que se manda a la base de datos

            call = conn.prepareCall(query);
            call.setString(1, email);
            call.setString(2, password);//Prepara la consulta para mandar el query
            rs = call.executeQuery();//Trae la consulta y ejecuta el query

            if (rs.next()) {

                switch (rs.getString("user_role")) {
                    case "Admin":

                        User admin = new DaoUser().findOneAdmin(rs.getLong("id_user"));

                        return admin;
                    case "Representative":
                        Representatives representative = new Representatives();
                        return representative;

                }


            }

            //


        } catch (SQLException e) {
            Logger.getLogger(DaoUser.class.getName())
                    .log(Level.SEVERE, "Error findAll" + e.getMessage());
        }
        return user;
    }

    public User findOneAdmin(long id ) {
        User user = null;


        try {

            conn = new MySQLConnection().connect(); // Coneccion a la base de datos
            String query = "select id_user, name, lastname, lastname2, user_role from users where ? = id_user ;";//Cosulta que se manda a la base de datos

            call = conn.prepareCall(query);
            call.setLong(1, id);
            rs = call.executeQuery();//Trae la consulta y ejecuta el query

            if (rs.next()) {


                        User admin = new User();
                        admin.setRole(rs.getString("user_role"));
                admin.setLastname(rs.getString("lastname"));
                admin.setLastname2(rs.getString("lastname2"));
                admin.setName(rs.getString("name"));
                admin.setId_user(rs.getLong("id_user"));

                        return admin;

            }

            //


        } catch (SQLException e) {
            Logger.getLogger(DaoUser.class.getName())
                    .log(Level.SEVERE, "Error findAll" + e.getMessage());
        }
        return user;
    }


}
