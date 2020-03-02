package ProductDiscount;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Servlet")
public class DiscountCalculator extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Product products = new Product();
        products.productDescription = request.getParameter("description");
        products.listPrice = Float.parseFloat(request.getParameter("listPrice"));
        products.discountPercent = Float.parseFloat(request.getParameter("discountPercent"));
        products.discountAmount = products.listPrice*products.discountPercent*0.1;

        if(products.listPrice>=5.0f) {
            RequestDispatcher dispatcher = request.getRequestDispatcher("DisplayDiscount.jsp");
            request.setAttribute("products", products);
            dispatcher.forward(request, response);
        }
        else
            response.sendRedirect("DisplayDiscount.jsp");
    }
}
