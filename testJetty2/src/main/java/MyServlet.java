import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class MyServlet extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        super.doPost(req, resp);
    }

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");



//        int valInt=0;
//        String val = req.getParameter("val");
//        try {
//            valInt = Integer.parseInt(val);
//        }
//        catch ( Exception ex ) {
//        }
//        valInt*=valInt;
//
        PrintWriter pw = resp.getWriter();
//        String text="";
//        text+="<form name=\"test\" method=\"post\">";
//        text+="<p><b>Ваше имя:</b><br><input type='text' size='40' id='input' value='" + valInt +"'></p>";
//        text+="<p><input type='submit' value='Отправить'></p>;";
//        text+="</form>";
//        text+="<br><p><a href='http://localhost:8080/testJetty2/?val=3'>3*3</a></p>";
//        pw.println(text);







        Random rnd = new Random();
        int x=rnd.nextInt(10)+1;
        pw.println("Случайкое число - "+x);
    }
}