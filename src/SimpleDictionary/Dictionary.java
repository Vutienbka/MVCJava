package SimpleDictionary;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Dictionary",urlPatterns = {"/search"})
public class Dictionary extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        DictManage dict = new DictManage();
        dict.initializeWordList();
        String searchingWord = request.getParameter("searchingWord");
        String mean =dict.search(searchingWord);
        if(mean!=""){
            RequestDispatcher dispatcher = request.getRequestDispatcher("Dictionary.jsp");
            request.setAttribute("mean",mean);
            request.setAttribute("searchingWord",searchingWord);
            dispatcher.forward(request,response);
        }
        else {
            mean = "word not found";
            RequestDispatcher dispatcher = request.getRequestDispatcher("Dictionary.jsp");
            request.setAttribute("mean", mean);
            request.setAttribute("searchingWord",searchingWord);
            dispatcher.forward(request, response);
        }
    }
}
