import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/")
public class MyServlet extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");


        String name = req.getParameter("name");
        String surname = req.getParameter("surname");

        /*передача значения в JSP*/
        String result = "";
        StringBuffer HTML=new StringBuffer(result);
        HTML.append("<br><h1>Method POST</h1> ");
        HTML.append("<br>Name - " + name);
        HTML.append("<br>Surname - " + surname);


        req.setAttribute("result",HTML);
        req.getRequestDispatcher("index.jsp").forward(req, resp);

//        /*принимаем параметы из метода GET*/
//        resp.setContentType("text/html;charset=utf-8");
//        String name = req.getParameter("name");
//        String surname = req.getParameter("surname");
//
//        PrintWriter pw = resp.getWriter();
//        pw.println("<h1>Method POST</h1>");
//        pw.println("Name - "+name);
//        pw.println("Surname - "+surname);
    }

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");

        String name = req.getParameter("name");
        String surname = req.getParameter("surname");

        /*передача значения в JSP*/
        String result = "";
        StringBuffer HTML=new StringBuffer(result);
        HTML.append("<br><h1>Method GET</h1> ");
        HTML.append("<br>Name - " + name);
        HTML.append("<br>Surname - " + surname);


        req.setAttribute("result",HTML);
        req.getRequestDispatcher("index.jsp").forward(req, resp);


//        /*принимаем параметы из метода GET*/
//        String name = req.getParameter("name");
//        String surname = req.getParameter("surname");
//        PrintWriter pw = resp.getWriter();
//        pw.println("<h1>Method GET</h1>");
//        pw.println("Name - "+name);
//        pw.println("Surname - "+surname);


//        /*передача значения в JSP*/
//        String text = "1 СООБЩЕНИЕ";
//        req.setAttribute("text",text);
//        req.getRequestDispatcher("index.jsp").forward(req, resp);

//        /*Стринг поток на страничцу*/
//        PrintWriter pw = resp.getWriter();
//        Random rnd = new Random();
//        int x=rnd.nextInt(10)+1;
//        pw.println("Случайкое число - "+x);
    }
}