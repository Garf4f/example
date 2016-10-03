import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");

        PrintWriter pw = resp.getWriter();
        Random rnd = new Random();

        pw.println("<H1>Hello, world! или Привет мир</H1>");

        int x=rnd.nextInt(10)+1;

        pw.println("Случайкое число - "+x);

        pw.println("<p><a href='http://localhost:8080/testJetty2/'>back</a></p>");

    }
}