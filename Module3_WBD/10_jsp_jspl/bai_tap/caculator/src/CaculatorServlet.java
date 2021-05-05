import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "CaculatorServlet",urlPatterns = "/caculate")
public class CaculatorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Float a = Float.parseFloat(request.getParameter("numberone"));
        Float b = Float.parseFloat(request.getParameter("numbertwo"));
        char operator = request.getParameter("operator").charAt(0);
        float result = Caculator.caculate(a,b,operator);
        request.setAttribute("resultnumber",result);
        request.getRequestDispatcher("index1.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
