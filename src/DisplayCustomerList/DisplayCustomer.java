package DisplayCustomerList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "DisplayCustomer", urlPatterns = {"/Display"})
public class DisplayCustomer extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        CustomerManage customerManage = new CustomerManage();
        customerManage.initializeCustomerList();
        ArrayList<Customer> customerList = (ArrayList<Customer>) customerManage.customerList;

        RequestDispatcher dispatcher = request.getRequestDispatcher("DisplayCustomer.jsp");
        request.setAttribute("customerList",customerList);
        dispatcher.forward(request,response);
    }
}
