package ProductShow;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ProductShow.Login")
public class Login extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("username");
        String password = request.getParameter("password");
        if (name.equals("admin") && password.equals("tien")) {
            response.sendRedirect("welcome.jsp");

        } else {
            response.sendRedirect("index.jsp");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String[] products = {
                "ASUS",
                "IPHONE X",
                "SAMSUNG GALAXY"
        };

        String name = request.getParameter("username");
        String password = request.getParameter("password");

        if (name.equals("admin") && password.equals("tien")) {
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("ShowProducts.jsp");
            request.setAttribute("product", products);
            requestDispatcher.forward(request, response);
        } else {
            response.sendRedirect("index.jsp");
        }
    }
}