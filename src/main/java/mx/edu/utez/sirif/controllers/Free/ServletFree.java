package mx.edu.utez.sirif.controllers.Free;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import mx.edu.utez.sirif.models.Dao.DaoMatches;
import mx.edu.utez.sirif.models.Dao.DaoPlayer;
import mx.edu.utez.sirif.models.Dao.DaoRankingPlayer;
import mx.edu.utez.sirif.models.Dao.DaoTeams;
import mx.edu.utez.sirif.models.Object.Player;
import mx.edu.utez.sirif.models.Object.User;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "Free",
        urlPatterns = {
                "/inicio",
                "/ranking",
                "/Horarios",
                "/Teams",
                "/inicioSession"


        })
public class ServletFree extends HttpServlet {
    private String action ;
    private String redirect = "/inicio" ;
    private List<Player> players;
    private long id ;

    private String email,password ;
    private User user;
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        action = req.getServletPath();
        switch (action)
        {
            case "/inicio":
                req.setAttribute("stadist",new DaoRankingPlayer().findStadistic());

                redirect="/index.jsp";
                break;
            case "/ranking":
                req.setAttribute("listGoals",new DaoRankingPlayer().findAllGoals());
                req.setAttribute("listAsist",new DaoRankingPlayer().findAllAsist());
                req.setAttribute("listCard",new DaoRankingPlayer().findAllTar());
                redirect="/views/nav/Ranking.jsp";
                break;
            case "/inicioSession":
                redirect="/views/nav/InicioSession.jsp";
                break;
            case "/Horarios":
                req.setAttribute("matches",new DaoMatches().findAll());

                redirect="/views/nav/Horarios.jsp";
                break;
            case "/Teams":
                if ( (req.getParameter("id") != null))
                    req.setAttribute("players",new DaoPlayer().findAllTeam(Long.parseLong(req.getParameter("id"))));


                req.setAttribute("teams",new DaoTeams().findAll());
                redirect="/views/nav/servicios/equipos.jsp";
                break;

        }
        req.getRequestDispatcher(redirect).forward(req,resp);

    }

    protected void doPost(jakarta.servlet.http.HttpServletRequest req, jakarta.servlet.http.HttpServletResponse resp) throws jakarta.servlet.ServletException, java.io.IOException
    {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html");
        switch (action)
        {
            case "/inicio":
                redirect="/index.jsp";
                break;
        }
        resp.sendRedirect(req.getContextPath()+redirect);

    }
}
