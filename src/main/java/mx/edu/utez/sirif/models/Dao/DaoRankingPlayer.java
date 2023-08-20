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

public class DaoRankingPlayer {
    private Connection conn;//Coneccion


    private PreparedStatement pstm; //Es domnde nosotros preparamos la sentencia sql y se pueda leer del lado del sql

    private ResultSet rs;
    public List<Ranking_players> findAllGoals() {
        List<Ranking_players> rankingPlayers = null;
        try {
            rankingPlayers = new ArrayList<>();
            conn = new MySQLConnection().connect(); // Coneccion a la base de datos
            String query = "select * from list_ranking_players;";//Cosulta que se manda a la base de datos
            pstm = conn.prepareStatement(query);//Prepara la consulta para mandar el query
            rs = pstm.executeQuery();//Trae la consulta y ejecuta el query
            while (rs.next())//Verifica si hay datos
            {
                Ranking_players rankingPlayers1 = new Ranking_players();
                rankingPlayers1.setGoals(rs.getInt("Goals"));
                Player player = new Player();
                player.setName(rs.getString("Name_player"));
                player.setLastname(rs.getString("Surname"));
                player.setLastname2(rs.getString("Surname2"));
                Team team = new Team();
                team.setName_team(rs.getString("Name_team"));
                player.setTeam(team);
                rankingPlayers1.setPlayer(player);
                System.out.println(player.getName());
                rankingPlayers.add(rankingPlayers1);

            }
            return rankingPlayers;
        } catch (SQLException e) {
            Logger.getLogger(DaoRankingPlayer.class.getName())
                    .log(Level.SEVERE, "Error findAll" + e.getMessage());
        }finally {
            close();
        }

        return rankingPlayers;
    }
    public List<Ranking_players> findAllAsist() {
        List<Ranking_players> rankingPlayers = null;
        try {
            rankingPlayers = new ArrayList<>();
            conn = new MySQLConnection().connect(); // Coneccion a la base de datos
            String query = "select * from list_ranking_players_astis;";//Cosulta que se manda a la base de datos
            pstm = conn.prepareStatement(query);//Prepara la consulta para mandar el query
            rs = pstm.executeQuery();//Trae la consulta y ejecuta el query
            while (rs.next())//Verifica si hay datos
            {
                Ranking_players rankingPlayers1 = new Ranking_players();
                rankingPlayers1.setAssistences(rs.getInt("Assistences"));
                Player player = new Player();
                player.setName(rs.getString("Name_player"));
                player.setLastname(rs.getString("Surname"));
                player.setLastname2(rs.getString("Surname2"));
                Team team = new Team();
                team.setName_team(rs.getString("Name_team"));
                player.setTeam(team);
                rankingPlayers1.setPlayer(player);
                System.out.println(player.getName());
                rankingPlayers.add(rankingPlayers1);

            }
            return rankingPlayers;
        } catch (SQLException e) {
            Logger.getLogger(DaoRankingPlayer.class.getName())
                    .log(Level.SEVERE, "Error findAll" + e.getMessage());
        }finally {
            close();
        }

        return rankingPlayers;
    }
    public List<Ranking_players> findAllTar() {
        List<Ranking_players> rankingPlayers = null;
        try {
            rankingPlayers = new ArrayList<>();
            conn = new MySQLConnection().connect(); // Coneccion a la base de datos
            String query = "select * from list_ranking_players_red_yellow;";//Cosulta que se manda a la base de datos
            pstm = conn.prepareStatement(query);//Prepara la consulta para mandar el query
            rs = pstm.executeQuery();//Trae la consulta y ejecuta el query
            while (rs.next())//Verifica si hay datos
            {
                Ranking_players rankingPlayers1 = new Ranking_players();
                rankingPlayers1.setRed_card(rs.getInt("Red_card"));
                rankingPlayers1.setYel_card(rs.getInt("Yel_card"));
                Player player = new Player();
                player.setName(rs.getString("Name_player"));
                player.setLastname(rs.getString("Surname"));
                player.setLastname2(rs.getString("Surname2"));
                Team team = new Team();
                team.setName_team(rs.getString("Name_team"));
                player.setTeam(team);
                rankingPlayers1.setPlayer(player);
                System.out.println(player.getName());
                rankingPlayers.add(rankingPlayers1);

            }
            return rankingPlayers;
        } catch (SQLException e) {
            Logger.getLogger(DaoRankingPlayer.class.getName())
                    .log(Level.SEVERE, "Error findAll" + e.getMessage());
        }finally {
            close();
        }

        return rankingPlayers;
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
