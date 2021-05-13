package controller;

import model.bean.User;
import model.service.UserService;
import model.service.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "UserServlet",urlPatterns = "/users")
public class UserServlet extends HttpServlet {
    UserService userService = new UserServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action =request.getParameter("action");
        if (action == null){
            action ="";
        }
        switch (action){
            case "create":
                createUser(request,response);
                break;
            default:
                break;
        }
    }

    private void createUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        String name = request.getParameter("name");
        String email = (request.getParameter("email"));
        String country = request.getParameter("country");
        User user = new User( name, email, country);
        this.userService.save(user);
        request.getRequestDispatcher("user/create.jsp").forward(request,response);
        request.setAttribute("message", "New product was created");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       String action =request.getParameter("action");
       if (action == null){
           action ="";
       }
       switch (action){
           case "create":
               showCreate(request,response);
               break;
           default:
               listUsers(request,response);
               break;
       }
    }

    private void showCreate(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("user/create.jsp").forward(request,response);
    }

    private void listUsers(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("listusers",userService.findAll());
        request.getRequestDispatcher("user/list.jsp").forward(request,response);

    }
}
