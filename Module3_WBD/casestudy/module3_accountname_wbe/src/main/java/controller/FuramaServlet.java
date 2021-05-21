package controller;

import model.bean.Customer;
import model.service.FuramaService;
import model.service.impl.FuramaServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "FuramaServlet", urlPatterns = "/")
public class FuramaServlet extends HttpServlet {
    FuramaService furamaService = new FuramaServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String action = request.getParameter("action");
    if (action== null){
        action = "";
    }
    switch (action){
        case "showcustomer":
            showListCustomer(request,response);
            break;
        default:
            home(request,response);
            break;
    }
    }

    private void showListCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Customer> customerList = this.furamaService.findAll();
        request.setAttribute("listCustomer",this.furamaService.findAll());
        request.getRequestDispatcher("customer.jsp").forward(request,response);
    }

    private void home(HttpServletRequest request, HttpServletResponse response) {
        try {
            request.getRequestDispatcher("home.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
