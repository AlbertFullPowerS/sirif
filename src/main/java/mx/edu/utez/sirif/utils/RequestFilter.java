package mx.edu.utez.sirif.utils;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebFilter(urlPatterns = {"/*"})

public class RequestFilter implements Filter {


    List<String> whiteList = new ArrayList<>();
    ArrayList<String> adminURL = new ArrayList<>();
    ArrayList<String> RepresentativesURL = new ArrayList<>();
    ArrayList<String> Free = new ArrayList<>();

    ArrayList<String> jspURL = new ArrayList<>();
int i = 0 ;



    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        //Endpoints publicos
        whiteList.add("/index.jsp");

        ServletContext servletContext = filterConfig.getServletContext();
       // adminURL.addAll( servletContext.getServletRegistrations().get("Admin").getMappings());
        Free.addAll( servletContext.getServletRegistrations().get("Free").getMappings());
       // RepresentativesURL.addAll( servletContext.getServletRegistrations().get("Consultor").getMappings());
        jspURL.addAll( servletContext.getServletRegistrations().get("jsp").getMappings());

        System.out.println(servletContext.getServletRegistrations().get("Free").getMappings());


       // adminURL.addAll(jspURL);
        Free.addAll(jspURL);
        RepresentativesURL.addAll(jspURL);
    }

    @Override
    public void doFilter(ServletRequest servletRequest,
                         ServletResponse servletResponse,
                         FilterChain filterChain) throws IOException, ServletException {

        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        String action = request.getServletPath();
        System.out.println(action);
        System.out.println(action.substring(action.length() - 4).equals(".jsp"));

        if (Free.contains(action) || urlAcess(action) || whiteList.contains(action)) {
            filterChain.doFilter(servletRequest, servletResponse);
            System.out.println("aaa");

        } else {
            HttpSession session = request.getSession();
            if (session.getAttribute("user") != null) {



                System.out.println(session.getAttribute("user").getClass().getSimpleName());
                switch (session.getAttribute("user").getClass().getSimpleName())
                {
                    case "Admin":
                        if (adminURL.contains(action)  || urlAcess(action)){
                            filterChain.doFilter(servletRequest, servletResponse);
                        }else response.sendRedirect(request.getContextPath() + "/user/logout");
                        break;
                    case "Tutor":
                        if (RepresentativesURL.contains(action)|| urlAcess(action)){
                            filterChain.doFilter(servletRequest, servletResponse);
                        }else response.sendRedirect(request.getContextPath() + "/user/logout");
                        break;

                }


            } else {
                if(action.substring(action.length() - 4).equals(".jsp"))
                {
                    filterChain.doFilter(servletRequest, servletResponse);

                }
                else 
                response.sendRedirect(request.getContextPath() + "/inicio");
            }
        }
    }
public boolean urlAcess (String s){
        if (s.substring(s.length() - 4).equals(".css")
                || s.substring(s.length() - 3).equals(".js")
                || s.substring(s.length() - 4).equals(".png")
                || s.substring(s.length() - 4).equals(".ttf")
                || s.substring(s.length() - 4).equals(".ico")) return true;
    return false;
}
    @Override
    public void destroy() {

    }
}
