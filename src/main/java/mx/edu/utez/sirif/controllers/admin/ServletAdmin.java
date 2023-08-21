package mx.edu.utez.sirif.controllers.admin;

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

@WebServlet(name = "Admin",
        urlPatterns = {
                "/admin/inicio",



        })
public class ServletAdmin extends HttpServlet {
    private String action ;
    private String redirect = "/admin/inicio" ;
    private List<Player> players;
    private long id ;

    private String email,password ;
    private User user;
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        action = req.getServletPath();
        switch (action)
        {
            case "/admin/inicio":
                redirect="/views/admin/inicio_admin.jsp";
                break;


        }
        req.getRequestDispatcher(redirect).forward(req,resp);

    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
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
