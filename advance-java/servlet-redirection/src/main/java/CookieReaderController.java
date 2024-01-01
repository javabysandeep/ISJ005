import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

@WebServlet("/read")
public class CookieReaderController extends HttpServlet {

    public static void main(String[] args) {
        System.out.println("hello world");
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();
        writer.println("Greeting of the day " + LocalDateTime.now());
        Cookie[] cookies = req.getCookies();
        for (Cookie cookie : cookies) {
            writer.println(cookie.getName() + "\t" + cookie.getValue());
        }


    }
}
