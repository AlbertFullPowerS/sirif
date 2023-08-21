package mx.edu.utez.sirif.models.Dao;

import mx.edu.utez.sirif.models.Object.Player;
import mx.edu.utez.sirif.models.Object.Ranking_players;
import mx.edu.utez.sirif.models.Object.Team;
import mx.edu.utez.sirif.utils.MySQLConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DaoTeams {
    private Connection conn;//Coneccion


    private PreparedStatement pstm; //Es domnde nosotros preparamos la sentencia sql y se pueda leer del lado del sql

    private ResultSet rs;
    public List<Team> findAll() {
        List<Team> teams = null;
        try {
            teams = new ArrayList<>();
            conn = new MySQLConnection().connect(); // Coneccion a la base de datos
            String query = "select * from list_teams;";//Cosulta que se manda a la base de datos
            pstm = conn.prepareStatement(query);//Prepara la consulta para mandar el query
            rs = pstm.executeQuery();//Trae la consulta y ejecuta el query
            while (rs.next())//Verifica si hay datos
            {

                Team team = new Team();
                team.setName_team(rs.getString("Name_team"));
                team.setImagen_data(rs.getBytes("image_data"));
                team.setId_team(rs.getInt("Id_team"));

                teams.add(team);
            }
            return teams;
        } catch (SQLException e) {
            Logger.getLogger(DaoTeams.class.getName())
                    .log(Level.SEVERE, "Error findAll" + e.getMessage());
        }finally {
            close();
        }

        return teams;
    }


    public void close(){
        try{
            if(conn != null ) conn.close();
            if(pstm != null ) conn.close();
            if(rs != null ) conn.close();


        }catch(SQLException e)
        {
            Logger.getLogger(DaoTeams.class.getName())
                    .log(Level.SEVERE,"Error findAll" + e.getMessage());
        }
    }
}
