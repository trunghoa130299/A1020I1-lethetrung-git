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
import java.util.List;

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
            case "edit":
                editUser(request,response);
                break;
            case "delete":
                deleteUser(request,response);
                break;
            case "search":
                searchName(request,response);
                break;
            default:
                break;
        }
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
           case "edit":
               showEdit(request,response);
               break;
           case "delete":
               showDelete(request,response);
               break;
           case "sort":
               sortUser(request,response);
               break;
           default:
               listUsers(request,response);
               break;
       }

    }

    private void sortUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("listusers",this.userService.sortUser());
        request.getRequestDispatcher("user/list.jsp").forward(request,response);
    }

    private void showDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        User user = this.userService.findById(id);
        if(user == null){
            request.getRequestDispatcher("error-404.jsp").forward(request,response);
        } else {
            request.setAttribute("user", user);
            request.getRequestDispatcher("user/delete.jsp").forward(request,response);
        }
    }

    private void deleteUser(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        this.userService.delete(id);
        response.sendRedirect("/users");
    }
    private void editUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        User user = this.userService.findById(id);
        String name = request.getParameter("name");
        String email = (request.getParameter("email"));
        String country = request.getParameter("country");
        if (user == null) {
            request.getRequestDispatcher("error-404.jsp").forward(request,response);
        }
        else {
            user.setName(name);
            user.setEmail(email);
            user.setCountry(country);
            this.userService.update(id,user);
            request.setAttribute("user", user);
            request.setAttribute("message", "User information was updated");
            request.getRequestDispatcher("user/edit.jsp").forward(request,response);
        }

    }

    private void createUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        String name = request.getParameter("name");
        String email = (request.getParameter("email"));
        String country = request.getParameter("country");
        User user = new User( name, email, country);
        this.userService.save(user);
        request.getRequestDispatcher("user/create.jsp").forward(request,response);
        request.setAttribute("message", "New user was created");
    }
    private void showEdit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id =Integer.parseInt(request.getParameter("id"));
        User user =this.userService.findById(id);
        if (user == null){
            request.getRequestDispatcher("error-404.jsp").forward(request,response);
        }
        else {
            request.setAttribute("user",user);
            request.getRequestDispatcher("user/edit.jsp").forward(request,response);
        }
    }

    private void showCreate(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("user/create.jsp").forward(request,response);
    }

    private void listUsers(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("listusers",userService.findAll());
        request.getRequestDispatcher("user/list.jsp").forward(request,response);
    }
    private void searchName(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("search");
        List<User> userList = this.userService.findByName(name);
        if (userList == null) {
            request.getRequestDispatcher("error-404.jsp").forward(request,response);
        }else {
            request.setAttribute("listusers",userList);
            request.getRequestDispatcher("user/list.jsp").forward(request,response);
        }
    }

}
