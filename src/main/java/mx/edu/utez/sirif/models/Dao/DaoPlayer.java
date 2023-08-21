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

public class DaoPlayer {
    private Connection conn;//Coneccion


    private PreparedStatement pstm; //Es domnde nosotros preparamos la sentencia sql y se pueda leer del lado del sql

    private ResultSet rs;
    public List<Player> findAllTeam(long id) {
        List<Player> players = null;
        try {
            players = new ArrayList<>();
            conn = new MySQLConnection().connect(); // Coneccion a la base de datos
            String query = "call players_for_team(?) ;";//Cosulta que se manda a la base de datos
            pstm = conn.prepareStatement(query);
            pstm.setLong(1 , id);
            rs = pstm.executeQuery();//Trae la consulta y ejecuta el query
            while (rs.next())//Verifica si hay datos
            {

                Player player = new Player();
                player.setName(rs.getString("name"));
                player.setLastname(rs.getString("lastname"));
                player.setLastname2(rs.getString("lastname2"));
                player.setDorsal(rs.getString("Dorsal"));
                player.setPlaye6r_position(rs.getString("Player_position"));
                players.add(player);

            }
            return players;
        } catch (SQLException e) {
            Logger.getLogger(DaoPlayer.class.getName())
                    .log(Level.SEVERE, "Error findAll" + e.getMessage());
        }finally {
            close();
        }

        return players;
    }
    public void close(){
        try{
            if(conn != null ) conn.close();
            if(pstm != null ) conn.close();
            if(rs != null ) conn.close();


        }catch(SQLException e)
        {
            Logger.getLogger(DaoRankingPlayer.class.getName())
                    .log(Level.SEVERE,"Error findAll" + e.getMessage());
        }
}
}