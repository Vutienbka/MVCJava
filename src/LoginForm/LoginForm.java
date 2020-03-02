package LoginForm;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "LoginForm",urlPatterns = {"/Login"})
public class LoginForm extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("Email");
        String userName = request.getParameter("UserName");
        String password = request.getParameter("Password");
        String sayHello;
        String msg;
        PrintWriter writer = response.getWriter();

        if((userName.equals("admin"))&&(email.equals("vutienbka@gmail.com"))&&(password.equals("tien"))) {
            sayHello= "Hello Everyone";
            writer.println("<script type=\"text/javascript\">");
            writer.println("alert(\"" +sayHello+ "\")");
            writer.println("location='LoginForm.jsp';");
            writer.println("</script>");
        }
        else {
            msg= "Your Email or UserName or password incorrect";
            writer.println("<script type=\"text/javascript\">");
            writer.println("alert(\"" +msg+ "\")");
            writer.println("location='LoginForm.jsp';");
            writer.println("</script>");
        }
    }
}
