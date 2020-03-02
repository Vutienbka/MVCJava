package MVC_Customer.Controler;

import MVC_Customer.CustomerService.CustomerService;
import MVC_Customer.Model.Customer;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet(name = "CustomerServlet",urlPatterns = {"/"})
public class CustomerServlet extends HttpServlet {
    CustomerService customerService = new CustomerService();
    ArrayList<Customer> customerList = customerService.findAll();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if(action==null)
        {
            action="";
        }

        switch (action){
            case "create":
                createNewCustomer(request,response);
                System.out.println("HAha");
                break;
            case "edit":
                editCustomer(request,response);
                System.out.println("hihihi");
                break;
            case "delete":
                deleteCustomer(request,response);
                break;
            default:
                listCustomer(request,response);
                break;
        }
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if(action==null)
        {
            action="";
        }
        switch (action) {
            case "create":
                showCreateForm(request,response);
            case "view":
                viewCustomer(request,response);
                break;
            case "edit":
                showEditForm(request,response);
                System.out.println("hihi");
                break;
            case "delete":
                showDeleteForm(request,response);
                break;
            default:listCustomer(request,response);
            break;
        }
    }

    public void listCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("MVC_List.jsp");
        request.setAttribute("customerList",customerList);
        dispatcher.forward(request,response);
    }
    public void createNewCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int Id = Integer.parseInt(request.getParameter("Id"));
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        String dateOfBirth = request.getParameter("dateOfBirth");
        String image = request.getParameter("img");
        Customer newCustomer = new Customer(Id,name,email,address,dateOfBirth,image);
         customerService.save(newCustomer);
         customerList = customerService.findAll();

        String message = "New customer is created";
        PrintWriter writer = response.getWriter();
        /*RequestDispatcher dispatcher = request.getRequestDispatcher("MVC_Create.jsp");
        request.setAttribute("message",message);
        dispatcher.forward(request,response);
        */
        writer.println("<script type=\"text/javascript\">");
        writer.println("alert(\"" +message+ "\")");
        writer.println("location='MVC_Create.jsp';");
        writer.println("</script>");
    }
    private void showCreateForm(HttpServletRequest request, HttpServletResponse response) {
        RequestDispatcher dispatcher = request.getRequestDispatcher("MVC_Create.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void editCustomer(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int Id = Integer.parseInt(String.valueOf(request.getParameter("Id")));
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        String dateOfBirth = request.getParameter("dateOfBirth");
        String image = request.getParameter("img");
        customerList = customerService.findAll();

        Customer customer = this.customerService.findById(Id);
        RequestDispatcher dispatcher;
        if(customer == null){
            dispatcher = request.getRequestDispatcher("MVC_error_404.jsp");
        } else {
            customer.setId(Id);
            customer.setName(name);
            customer.setEmail(email);
            customer.setAddress(address);
            customer.setDateOfBirth(dateOfBirth);
            customer.setImage(image);
            this.customerService.update(Id, customer);
            request.setAttribute("customer", customer);
            request.setAttribute("message", "Customer information was updated");
            dispatcher = request.getRequestDispatcher("MVC_Edit.jsp");
        }
        try {
            dispatcher.forward(request, response);

        } catch (IOException | ServletException e) {
            e.printStackTrace();
        }
    }
    private void showEditForm(HttpServletRequest request, HttpServletResponse response) {
        int Id = Integer.parseInt(request.getParameter("Id"));
        Customer customer = this.customerService.findById(Id);
        RequestDispatcher dispatcher;
        if(customer == null){
            dispatcher = request.getRequestDispatcher("MVC_error_404.jsp");
        } else {
            request.setAttribute("customer", customer);
            dispatcher = request.getRequestDispatcher("MVC_Edit.jsp");
        }
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void deleteCustomer(HttpServletRequest request, HttpServletResponse response) {
        int Id = Integer.parseInt(request.getParameter("Id"));
        Customer customer = this.customerService.findById(Id);
        RequestDispatcher dispatcher;
        if(customer == null){
            dispatcher = request.getRequestDispatcher("MVC_error_404.jsp");
        } else {
            this.customerService.remove(Id);
            try {
                customerList = customerService.findAll();
                listCustomer(request,response);
            } catch (IOException | ServletException e) {
                e.printStackTrace();
            }
        }
    }
    private void showDeleteForm(HttpServletRequest request, HttpServletResponse response) {
        int Id = Integer.parseInt(request.getParameter("Id"));
        Customer customer = this.customerService.findById(Id);
        RequestDispatcher dispatcher;
        if(customer == null){
            dispatcher = request.getRequestDispatcher("MVC_error_404.jsp");
        } else {
            request.setAttribute("customer", customer);
            dispatcher = request.getRequestDispatcher("MVC_Delete.jsp");
        }
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void viewCustomer(HttpServletRequest request, HttpServletResponse response) {
        int Id = Integer.parseInt(request.getParameter("Id"));
        Customer customer = this.customerService.findById(Id);
        RequestDispatcher dispatcher;
        if(customer == null){
            dispatcher = request.getRequestDispatcher("MVC_error_404.jsp");
        } else {
            request.setAttribute("customer", customer);
            dispatcher = request.getRequestDispatcher("MVC_View.jsp");
        }
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
