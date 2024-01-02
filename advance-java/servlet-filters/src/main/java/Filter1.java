import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;

import java.io.IOException;
import java.io.PrintWriter;

@WebFilter(filterName = "Filter1", urlPatterns = {"/servlet1", "/servlet2", "/servlet3"})
public class Filter1 implements Filter {
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Filter doFilter method");
        PrintWriter writer = servletResponse.getWriter();
        writer.println("Pre-Processing done by Filter1");

        filterChain.doFilter(servletRequest, servletResponse);

        writer.println("Post-Processing done by Filter1");

    }

    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("Filter Init method");

    }

    public void destroy() {
        System.out.println("Filter destroy method");
    }
}
