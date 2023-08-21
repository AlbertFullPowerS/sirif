package mx.edu.utez.sirif.models.Dao;

import mx.edu.utez.sirif.models.Object.Matches;
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

public class DaoMatches  {
    private Connection conn;//Coneccion


    private PreparedStatement pstm; //Es domnde nosotros preparamos la sentencia sql y se pueda leer del lado del sql

    private ResultSet rs;
    PreparedStatement pstm2; //Es domnde nosotros preparamos la sentencia sql y se pueda leer del lado del sql

    private ResultSet rs2;
    public List<Matches> findAll() {
        List<Matches> matches = null;
        try {
            matches = new ArrayList<>();
            conn = new MySQLConnection().connect(); // Coneccion a la base de datos
            String query = "select start_hour ,  end_hour , date_match , Name_team " +
                    "  from matches m inner join  teams  t on t.Id_team = m.fk_team2;";//Cosulta que se manda a la base de datos
            pstm = conn.prepareStatement(query);//Prepara la consulta para mandar el query
            rs = pstm.executeQuery();//Trae la consulta y ejecuta el query

            String query2 = "select Name_team  from matches m inner join teams t on " +
                    " t.Id_team = m.fk_team1 ;";//Cosulta que se manda a la base de datos
            pstm2 = conn.prepareStatement(query2);//Prepara la consulta para mandar el query
            rs2 = pstm2.executeQuery();//Trae la consulta y ejecuta el query
            while (rs.next() && rs2.next())//Verifica si hay datos
            {
                Matches matches1 = new Matches();
                Team team = new Team();
                team.setName_team(rs.getString("Name_team"));
                Team team1 = new Team();
                team1.setName_team(rs2.getString("Name_team"));
                matches1.setTeam(team);
                matches1.setTeam1(team1);
                matches1.setDate_match(rs.getString("date_match"));
                matches1.setStart_hour(rs.getString("start_hour"));
                matches1.setEnd_hour(rs.getString("end_hour"));


                matches.add(matches1);
            }
            return matches;
        } catch (SQLException e) {
            Logger.getLogger(DaoMatches.class.getName())
                    .log(Level.SEVERE, "Error findAll" + e.getMessage());
        }finally {
            close();
        }

        return matches;
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
