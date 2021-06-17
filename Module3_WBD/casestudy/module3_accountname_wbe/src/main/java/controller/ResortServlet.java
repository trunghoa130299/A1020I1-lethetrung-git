package controller;

import model.bean.*;
import model.service.ResortService;
import model.service.impl.ResortServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet(name = "ResortServlet", urlPatterns = "/a")
public class ResortServlet extends HttpServlet {
    ResortService resortService = new ResortServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "createCustomer":
                CreateCustomer(request, response);
                break;
            case "editCustomer":
                EditCustomer(request, response);
                break;
            case "deleteCustomer":
                DeleteCustomer(request, response);
                break;
            case "createEmployee":
                CreateEmployee(request, response);
                break;
            case "editEmployee":
                EditEmployee(request, response);
                break;
            case "deleteEmployee":
                DeleteEmployee(request, response);
                break;
            case "login":
                showLogin(request, response);
                break;
            case "createUser":
                CreateUser(request, response);
                break;
            default:
                break;
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "showCustomer":
                showListCustomer(request, response);
                break;
            case "createCustomer":
                showCreateCustomer(request, response);
                break;
            case "editCustomer":
                showEditCustomer(request, response);
                break;
            case "showEmployee":
                showListEmployee(request, response);
                break;
            case "createEmployee":
                showCreateEmployee(request, response);
                break;
            case "editEmployee":
                showEditEmployee(request, response);
                break;
            case "search":
                searchCustomer(request, response);
                break;
            case "search1":
                searchEmployee(request, response);
                break;
            case "home":
                home(request, response);
                break;
            case "createUser":
                showCreateUser(request, response);
                break;
            default:
                showLoginGet(request, response);
                break;
        }
    }

    private void CreateUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user = request.getParameter("user");
        String password = (request.getParameter("password"));
        Login login = new Login(user, password);
        this.resortService.createUser(login);
        request.setAttribute("message", "User was created !");
        request.getRequestDispatcher("login.jsp").forward(request, response);
    }

    private void showCreateUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("login.jsp").forward(request, response);
    }

    private void showLoginGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("login.jsp").forward(request, response);
    }

    private void showLogin(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String us = request.getParameter("us");
        String pw = request.getParameter("pw");
        Login login = this.resortService.checkLogin(us, pw);
        if (login != null) {
            Cookie ck = new Cookie(us, pw);
            ck.setMaxAge(600);
            response.addCookie(ck);
            HttpSession session = request.getSession();
            session.setAttribute("abc", us);
            request.getRequestDispatcher("home.jsp").forward(request, response);
        } else {
            request.setAttribute("message", "User name or password is wrong !");
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }
    }

    private void DeleteEmployee(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        int id = Integer.parseInt(request.getParameter("idEmployee"));
        this.resortService.deleteEmployee(id);
        response.sendRedirect("?action=showEmployee");
    }

    private void searchEmployee(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("value");
        request.setAttribute("action", "searchEmployee");
        request.setAttribute("type", "employee");
        request.setAttribute("value", name);
        request.setAttribute("listEmployee", this.resortService.findNameEmployee(name));
        request.getRequestDispatcher("employee.jsp").forward(request, response);
    }

    private void searchCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("value");
        request.setAttribute("listCustomer", this.resortService.findNameCustomer(name));
        request.getRequestDispatcher("customer.jsp").forward(request, response);
    }

    private void EditEmployee(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Employee employee = this.resortService.findByIdEmployee(id);
        String hoten = request.getParameter("hoten");
        String ngaysinh = (request.getParameter("ngaysinh"));
        String cmtnd = request.getParameter("cmtnd");
        String luong = request.getParameter("luong");
        String sdt = request.getParameter("sdt");
        String email = request.getParameter("email");
        int idVitri_nv = Integer.parseInt(request.getParameter("idVitri_nv"));
        int idTrinhDo_nv = Integer.parseInt(request.getParameter("idTrinhDo_nv"));
        if (employee == null) {
            request.getRequestDispatcher("error-404.jsp").forward(request, response);
        } else {
            employee.setHoTen(hoten);
            employee.setNgaySinh(ngaysinh);
            employee.setCmnd(cmtnd);
            employee.setLuong(luong);
            employee.setSdt(sdt);
            employee.setEmail(email);
            employee.setIdVitri_nv(idVitri_nv);
            employee.setIdTrinhDo_nv(idTrinhDo_nv);
            this.resortService.updateEmployee(id, employee);
            request.setAttribute("employee", employee);
            request.setAttribute("message", "Employee was updated");
            request.getRequestDispatcher("EditEmployee.jsp").forward(request, response);
        }

    }

    private void showEditEmployee(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Employee employee = this.resortService.findByIdEmployee(id);
        if (employee == null) {
            request.getRequestDispatcher("error-404.jsp").forward(request, response);
        } else {
            request.setAttribute("employee", employee);
            request.getRequestDispatcher("EditEmployee.jsp").forward(request, response);
        }
    }

    private void CreateEmployee(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String hoten = request.getParameter("hoten");
        String ngaysinh = (request.getParameter("ngaysinh"));
        String cmtnd = request.getParameter("cmtnd");
        String luong = request.getParameter("luong");
        String sdt = request.getParameter("sdt");
        String email = request.getParameter("email");
        int idVitri_nv = Integer.parseInt(request.getParameter("idVitri_nv"));
        int idTrinhDo_nv = Integer.parseInt(request.getParameter("idTrinhDo_nv"));
        Employee employee = new Employee(hoten, ngaysinh, cmtnd, luong, sdt, email, idVitri_nv, idTrinhDo_nv);
        this.resortService.createEmployee(employee);
        request.setAttribute("listEmployee", this.resortService.findListEmployee());
        request.getRequestDispatcher("employee.jsp").forward(request, response);
    }

    private void showCreateEmployee(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("employee.jsp").forward(request, response);
    }

    private void showListEmployee(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("listEmployee", this.resortService.findListEmployee());
        request.getRequestDispatcher("employee.jsp").forward(request, response);
    }

    private void DeleteCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("idCustomer"));
        this.resortService.deleteCustomer(id);
        response.sendRedirect("?action=showCustomer");
    }

    private void EditCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Customer customer = this.resortService.findById(id);
        String hoten = request.getParameter("hoten");
        String ngaysinh = (request.getParameter("ngaysinh"));
        String cmtnd = request.getParameter("cmtnd");
        String sdt = request.getParameter("sdt");
        String email = request.getParameter("email");
        String diachi = request.getParameter("diachi");
        int idloaikhach_kh = Integer.parseInt(request.getParameter("idloaikhach_kh"));
        if (customer == null) {
            request.getRequestDispatcher("error-404.jsp").forward(request, response);
        } else {
            customer.setHoten(hoten);
            customer.setNgaySinh(ngaysinh);
            customer.setCmnd(cmtnd);
            customer.setSdt(sdt);
            customer.setEmail(email);
            customer.setDiaChi(diachi);
            customer.setIdLoaiKhach_kh(idloaikhach_kh);
            this.resortService.updateCustomer(id, customer);
            request.setAttribute("customer", customer);
            request.setAttribute("message", "Customer was updated");
            request.getRequestDispatcher("EditCustomer.jsp").forward(request, response);
        }
    }

    private void showEditCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Customer customer = this.resortService.findById(id);
        if (customer == null) {
            request.getRequestDispatcher("error-404.jsp").forward(request, response);
        } else {
            request.setAttribute("customer", customer);
            request.getRequestDispatcher("EditCustomer.jsp").forward(request, response);
        }
    }

    private void CreateCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String hoten = request.getParameter("hoten");
        String ngaysinh = (request.getParameter("ngaysinh"));
        String cmtnd = request.getParameter("cmtnd");
        String sdt = request.getParameter("sdt");
        String email = request.getParameter("email");
        String diachi = request.getParameter("diachi");
        int idloaikhach_kh = Integer.parseInt(request.getParameter("idloaikhach_kh"));
        Customer customer = new Customer(hoten, ngaysinh, cmtnd, sdt, email, diachi, idloaikhach_kh);
        this.resortService.createCustomer(customer);
        request.setAttribute("listCustomer", resortService.findAll());
        request.getRequestDispatcher("customer.jsp").forward(request, response);
    }

    private void showCreateCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("customer.jsp").forward(request, response);
    }

    private void showListCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("listCustomer", this.resortService.findAll());
        request.getRequestDispatcher("customer.jsp").forward(request, response);
    }

    private void home(HttpServletRequest request, HttpServletResponse response) {
        try {
            request.getRequestDispatcher("home.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
