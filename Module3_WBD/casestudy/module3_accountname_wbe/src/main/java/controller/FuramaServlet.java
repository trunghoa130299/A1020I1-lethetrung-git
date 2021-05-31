package controller;

import common.FuramaValidate;
import model.bean.*;
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
            case "createService":
                CreateService(request,response);
                break;
            case "deleteEmployee":
                DeleteEmployee(request,response);
                break;
            case "createContract":
                CreateContract(request,response);
                break;
            case "createContractDetail":
                CreateContractDetail(request,response);
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
                searchEmployee(request,response);
                break;
            case "showService":
                showService(request,response);
                break;
            case "showContract":
                showContract(request,response);
                break;
            case "createContract":
                showCreateContract(request,response);
                break;
            case "createContractDetail":
                showCreateContractDetail(request,response);
                break;
            default:
                home(request, response);
                break;
        }
    }
    private void CreateContractDetail(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int soluong = Integer.parseInt(request.getParameter("soluong"));
        int iddichvudikem_hdct = Integer.parseInt(request.getParameter("iddichvudikem_hdct"));
        int idhopdong_hdct = Integer.parseInt(request.getParameter("idhopdong_hdct"));
        ContractDetail contractDetail = new ContractDetail(soluong,iddichvudikem_hdct,idhopdong_hdct);
        this.furamaService.createContractDetail(contractDetail);
        request.setAttribute("message","ContractDetail was created");
        request.getRequestDispatcher("createContractDetail.jsp").forward(request, response);
    }

    private void showCreateContractDetail(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("createContractDetail.jsp").forward(request,response);
    }

    private void CreateContract(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String ngaylamhopdong = request.getParameter("ngaylamhopdong");
        String ngayketthuc = (request.getParameter("ngayketthuc"));
        int tiendatcoc = Integer.parseInt(request.getParameter("tiendatcoc"));
        int tongtien = Integer.parseInt(request.getParameter("tongtien"));
        int idnhanvien_hd = Integer.parseInt(request.getParameter("idnhanvien_hd"));
        int idkhachhang_hd = Integer.parseInt(request.getParameter("idkhachhang_hd"));
        int iddichvu_hd = Integer.parseInt(request.getParameter("iddichvu_hd"));
        Contract contract = new Contract(ngaylamhopdong,ngayketthuc,tiendatcoc,tongtien,idnhanvien_hd,idkhachhang_hd,iddichvu_hd);
        this.furamaService.createContract(contract);
        request.setAttribute("message","Contract was created");
        request.getRequestDispatcher("createContract.jsp").forward(request, response);
    }
    private void showCreateContract(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("createContract.jsp").forward(request,response);
    }
    private void DeleteEmployee(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int id = Integer.parseInt(request.getParameter("idEmployee"));
        this.furamaService.deleteEmployee(id);
        response.sendRedirect("/?action=showEmployee");
    }
    private void showContract(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("contract.jsp").forward(request,response);
    }

    private void CreateService(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String tendichvu = request.getParameter("tendichvu");
        int dientich = Integer.parseInt(request.getParameter("dientich"));
        String chiphithue = request.getParameter("chiphithue");
        String songuoitoida = request.getParameter("songuoitoida");
        int idkieuthue_dv = Integer.parseInt(request.getParameter("idkieuthue_dv"));
        Service service = new Service(tendichvu,dientich,chiphithue,songuoitoida,idkieuthue_dv);
        this.furamaService.createService(service);
        request.setAttribute("message","Service was created");
        request.getRequestDispatcher("service.jsp").forward(request,response);
    }

    private void showService(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("service.jsp").forward(request,response);
    }

    private void searchEmployee(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("value");
        request.setAttribute("action", "searchEmployee");
        request.setAttribute("type", "employee");
        request.setAttribute("value", name);
        request.setAttribute("listEmployee", this.furamaService.findNameEmployee(name));
        request.getRequestDispatcher("employee.jsp").forward(request, response);
    }

    private void searchCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("value");
        request.setAttribute("listCustomer", this.furamaService.findNameCustomer(name));
        request.getRequestDispatcher("customer.jsp").forward(request, response);
    }

    private void EditEmployee(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Employee employee = this.furamaService.findByIdEmployee(id);
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
            this.furamaService.updateEmployee(id, employee);
            request.setAttribute("employee", employee);
            request.setAttribute("message", "Employee was updated");
            request.getRequestDispatcher("EditEmployee.jsp").forward(request, response);
        }

    }

    private void showEditEmployee(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Employee employee = this.furamaService.findByIdEmployee(id);
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
        this.furamaService.createEmployee(employee);
        request.setAttribute("listEmployee",this.furamaService.findListEmployee());
        request.getRequestDispatcher("employee.jsp").forward(request, response);
    }

    private void showCreateEmployee(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("employee.jsp").forward(request, response);
    }

    private void showListEmployee(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("listEmployee", this.furamaService.findListEmployee());
        request.getRequestDispatcher("employee.jsp").forward(request, response);
    }

    private void DeleteCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("idCustomer"));
        this.furamaService.deleteCustomer(id);
        response.sendRedirect("/?action=showCustomer");
    }

    private void EditCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Customer customer = this.furamaService.findById(id);
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
            this.furamaService.updateCustomer(id, customer);
            request.setAttribute("customer",customer);
            request.setAttribute("message","Customer was updated");
            request.getRequestDispatcher("EditCustomer.jsp").forward(request, response);
        }
    }

    private void showEditCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Customer customer = this.furamaService.findById(id);
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
        this.furamaService.createCustomer(customer);
        request.setAttribute("listCustomer", furamaService.findAll());
        request.getRequestDispatcher("customer.jsp").forward(request,response);
    }

    private void showCreateCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("customer.jsp").forward(request, response);
    }

    private void showListCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("listCustomer", this.furamaService.findAll());
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
