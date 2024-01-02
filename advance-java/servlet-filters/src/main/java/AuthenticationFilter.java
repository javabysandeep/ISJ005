import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;

import java.io.IOException;
import java.io.PrintWriter;

@WebFilter(filterName = "AuthenticationFilter", urlPatterns = {"/servlet1", "/servlet2", "/servlet3"})
public class AuthenticationFilter implements Filter {
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        servletResponse.setContentType("text/html");
        String username = servletRequest.getParameter("username");
        String password = servletRequest.getParameter("password");
        if ("admin".equals(username) && "admin".equals(password)) {
            filterChain.doFilter(servletRequest, servletResponse);
        } else {
            servletResponse.getWriter().println("Invalid credentials");
            RequestDispatcher requestDispatcher = servletRequest.getRequestDispatcher("index.jsp");
            requestDispatcher.include(servletRequest, servletResponse);
        }

    }

}
