package CurrencyConveter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Servlet",urlPatterns = {"/converter"})
public class CurrencyConverter extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        long rate = Long.parseLong(request.getParameter("rate"));
        int usd = Integer.parseInt(request.getParameter("usd"));
        long vnd = usd * rate;
        response.setContentType("text/html");
        RequestDispatcher dispatcher = request.getRequestDispatcher("CurrencyConverter.jsp");
        request.setAttribute("vnd",vnd);
        request.setAttribute("rate",rate);
        request.setAttribute("usd",usd);
        dispatcher.forward(request,response);

        PrintWriter writer = response.getWriter();
        writer.println("<script type=\"text/javascript\">");
        writer.println("document.getElementById("+"'rate').value = 'rate' ");
        writer.println("document.getElementById(\"usd\").value = \""+usd+"\" ");
        writer.println("location='CurrencyConverter.jsp';");
        writer.println("</script>");
    }

}
