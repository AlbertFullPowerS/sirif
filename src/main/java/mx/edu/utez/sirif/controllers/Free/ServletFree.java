package mx.edu.utez.sirif.controllers.Free;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import mx.edu.utez.sirif.models.Object.User;

import java.io.IOException;

@WebServlet(name = "Free",
        urlPatterns = {
                "/inicio",
                "/ranking"

        })
public class ServletFree extends HttpServlet {
    private String action ;
    private String redirect = "/inicio" ;

    private String email,password ;
    private User user;
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        action = req.getServletPath();
        switch (action)
        {
            case "/inicio":
                redirect="/index.jsp";
                break;
            case "/ranking":
                redirect="/views/nav/Ranking.jsp";
                break;
        }
        resp.sendRedirect(req.getContextPath()
                + redirect);
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
        resp.sendRedirect(req.getContextPath()
                + redirect);
        action = req.getServletPath();
    }
}
