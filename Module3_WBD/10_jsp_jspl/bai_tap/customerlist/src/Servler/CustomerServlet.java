package Servler;

import Customer.Customer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "CustomerServlet",urlPatterns = "/aa")
public class CustomerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Customer> customerList = new ArrayList<>();
        customerList.add(new Customer("Mai Văn Hoàn","1983-08-20","Hà Nội" ,"web\\anh\\trunghoa.jpg"));
        customerList.add(new Customer("Nguyễn Văn Nam","1983-08-21","Bắc Giang " ,"web\\anh"));
        customerList.add(new Customer("Nguyễn Thái Hòa","1983-08-22","Nam Định " ,"web\\anh"));
        customerList.add(new Customer("Trần Đăng Khoa","1983-08-17","Hà Tây" ,"web\\anh"));
        customerList.add(new Customer("Nguyễn Đình Thi","1983-08-19","Hà Nội" ,"web\\anh"));

        request.setAttribute("list",customerList);
        request.getRequestDispatcher("index1.jsp").forward(request,response);
    }
}
