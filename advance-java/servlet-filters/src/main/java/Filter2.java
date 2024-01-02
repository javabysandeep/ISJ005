import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;

import java.io.IOException;
import java.io.PrintWriter;

public class Filter2 implements Filter {
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Filter2 doFilter method");
        PrintWriter writer = servletResponse.getWriter();
        writer.println("Pre-Processing done by Filter2");

        filterChain.doFilter(servletRequest, servletResponse);

        writer.println("Post-Processing done by Filter2");

    }

    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("Filter2 Init method");

    }

    public void destroy() {
        System.out.println("Filter2 destroy method");
    }
}
