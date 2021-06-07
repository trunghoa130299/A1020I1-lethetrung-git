package model.reponsitory.impl;

import model.bean.*;
import model.reponsitory.BaseRepository;
import model.reponsitory.FuramaRepository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class FuramaRepositoryImpl implements FuramaRepository {
    BaseRepository baseRepository = new BaseRepository();

    @Override
    public List<Customer> findAll() {
        List<Customer> customerList = new ArrayList<>();
        try {
            Statement statement = this.baseRepository.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery("select * from khachhang");
            Customer customer = null;
            while (resultSet.next()) {
                customer = new Customer();
                customer.setIdKhachHang(resultSet.getInt("idkhachhang"));
                customer.setHoten(resultSet.getString("hoten"));
                customer.setNgaySinh(resultSet.getString("ngaysinh"));
                customer.setCmnd(resultSet.getString("socmtnd"));
                customer.setSdt(resultSet.getString("sdt"));
                customer.setEmail(resultSet.getString("email"));
                customer.setDiaChi(resultSet.getString("diachi"));
                customer.setIdLoaiKhach_kh(resultSet.getInt("idloaikhach_kh"));
                customerList.add(customer);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return customerList;
    }

    @Override
    public boolean createCustomer(Customer customer) {
        int row = 0;
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection().prepareStatement
                    ("insert into khachhang (`hoten`,ngaysinh,socmtnd,sdt,email,diachi,idloaikhach_kh) values \n" +
                            "(?,?,?,?,?,?,?);");
            preparedStatement.setString(1, customer.getHoten());
            preparedStatement.setString(2, customer.getNgaySinh());
            preparedStatement.setString(3, customer.getCmnd());
            preparedStatement.setString(4, customer.getSdt());
            preparedStatement.setString(5, customer.getEmail());
            preparedStatement.setString(6, customer.getDiaChi());
            preparedStatement.setInt(7, customer.getIdLoaiKhach_kh());
            row = preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return row > 0;
    }

    @Override
    public Customer findById(int id) {
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection().prepareStatement("select * \n" +
                    "from khachhang where idkhachhang =?");
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            Customer customer = null;
            while (resultSet.next()) {
                customer = new Customer();
                customer.setIdKhachHang(resultSet.getInt("idkhachhang"));
                customer.setHoten(resultSet.getString("hoten"));
                customer.setNgaySinh(resultSet.getString("ngaysinh"));
                customer.setCmnd(resultSet.getString("socmtnd"));
                customer.setSdt(resultSet.getString("sdt"));
                customer.setEmail(resultSet.getString("email"));
                customer.setDiaChi(resultSet.getString("diachi"));
                customer.setIdLoaiKhach_kh(resultSet.getInt("idloaikhach_kh"));
                return customer;
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean updateCustomer(int id, Customer customer) {
        int row = 0;
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection().prepareStatement("update khachhang\n" +
                    "set `hoten` = ? , ngaysinh= ?,socmtnd =?,sdt = ?,email= ?,diachi=?,idloaikhach_kh =?\n" +
                    "where idkhachhang =?;");
            preparedStatement.setString(1, customer.getHoten());
            preparedStatement.setString(2, customer.getNgaySinh());
            preparedStatement.setString(3, customer.getCmnd());
            preparedStatement.setString(4, customer.getSdt());
            preparedStatement.setString(5, customer.getEmail());
            preparedStatement.setString(6, customer.getDiaChi());
            preparedStatement.setInt(7, customer.getIdLoaiKhach_kh());
            preparedStatement.setInt(8, customer.getIdKhachHang());
            row = preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return row > 0;
    }

    @Override
    public boolean deleteCustomer(int id) {
        int row = 0;
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection().
                    prepareStatement("delete  from khachhang where idkhachhang=?");
            preparedStatement.setInt(1, id);
            row = preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return row > 0;
    }

    @Override
    public List<Employee> findListEmployee() {
        List<Employee> employeeList = new ArrayList<>();
        try {
            Statement statement = this.baseRepository.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery("select * from nhanvien");
            Employee employee = null;
            while (resultSet.next()) {
                employee = new Employee();
                employee.setIdNhanVien(resultSet.getInt("idnhanvien"));
                employee.setHoTen(resultSet.getString("hoten"));
                employee.setNgaySinh(resultSet.getString("ngaysinh"));
                employee.setCmnd(resultSet.getString("socmtnd"));
                employee.setLuong(resultSet.getString("luong"));
                employee.setSdt(resultSet.getString("sdt"));
                employee.setEmail(resultSet.getString("email"));
                employee.setIdVitri_nv(resultSet.getInt("idvitri_nv"));
                employee.setIdTrinhDo_nv(resultSet.getInt("idtrinhdo_nv"));
                employeeList.add(employee);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return employeeList;
    }

    @Override
    public boolean createEmployee(Employee employee) {
        int row = 0;
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection().prepareStatement
                    ("insert into nhanvien (`hoten`,ngaysinh,socmtnd,luong,sdt,email,idVitri_nv,idTrinhDo_nv) values \n" +
                            "(?,?,?,?,?,?,?,?);");
            preparedStatement.setString(1, employee.getHoTen());
            preparedStatement.setString(2, employee.getNgaySinh());
            preparedStatement.setString(3, employee.getCmnd());
            preparedStatement.setString(4, employee.getLuong());
            preparedStatement.setString(5, employee.getSdt());
            preparedStatement.setString(6, employee.getEmail());
            preparedStatement.setInt(7, employee.getIdVitri_nv());
            preparedStatement.setInt(8, employee.getIdTrinhDo_nv());
            row = preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return row > 0;
    }

    @Override
    public Employee findByIdEmployee(int id) {
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection().prepareStatement("select * \n" +
                    "from nhanvien where idnhanvien =?");
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            Employee employee = null;
            while (resultSet.next()) {
                employee = new Employee();
                employee.setIdNhanVien(resultSet.getInt("idnhanvien"));
                employee.setHoTen(resultSet.getString("hoten"));
                employee.setNgaySinh(resultSet.getString("ngaysinh"));
                employee.setCmnd(resultSet.getString("socmtnd"));
                employee.setLuong(resultSet.getString("luong"));
                employee.setSdt(resultSet.getString("sdt"));
                employee.setEmail(resultSet.getString("email"));
                employee.setIdVitri_nv(resultSet.getInt("idvitri_nv"));
                employee.setIdTrinhDo_nv(resultSet.getInt("idtrinhdo_nv"));
                return employee;
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean updateEmployee(int id, Employee employee) {
        int row = 0;
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection().prepareStatement("update nhanvien\n" +
                    "set `hoten` = ? , ngaysinh= ?,socmtnd =?,luong= ?,sdt = ?,email= ?,idvitri_nv=?,idtrinhdo_nv =?\n" +
                    "where idnhanvien =?;");
            preparedStatement.setString(1, employee.getHoTen());
            preparedStatement.setString(2, employee.getNgaySinh());
            preparedStatement.setString(3, employee.getCmnd());
            preparedStatement.setString(4, employee.getLuong());
            preparedStatement.setString(5, employee.getSdt());
            preparedStatement.setString(6, employee.getEmail());
            preparedStatement.setInt(7, employee.getIdVitri_nv());
            preparedStatement.setInt(8, employee.getIdTrinhDo_nv());
            preparedStatement.setInt(9, employee.getIdNhanVien());
            row = preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return row > 0;
    }

    @Override
    public List<Customer> findNameCustomer(String name) {
        List<Customer> customerList = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection().
                    prepareStatement("select * from khachhang where `hoten` =?");
            preparedStatement.setString(1, name);
            ResultSet resultSet = preparedStatement.executeQuery();
            Customer customer = null;
            while (resultSet.next()) {
                customer = new Customer();
                customer.setIdKhachHang(resultSet.getInt("idkhachhang"));
                customer.setHoten(resultSet.getString("hoten"));
                customer.setNgaySinh(resultSet.getString("ngaysinh"));
                customer.setCmnd(resultSet.getString("socmtnd"));
                customer.setSdt(resultSet.getString("sdt"));
                customer.setEmail(resultSet.getString("email"));
                customer.setDiaChi(resultSet.getString("diachi"));
                customer.setIdLoaiKhach_kh(resultSet.getInt("idloaikhach_kh"));
                customerList.add(customer);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return customerList;
    }

    @Override
    public List<Employee> findNameEmployee(String name) {
        List<Employee> employeeList = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection().
                    prepareStatement("select * from nhanvien where `hoten` =?");
            preparedStatement.setString(1, name);
            ResultSet resultSet = preparedStatement.executeQuery();
            Employee employee = null;
            while (resultSet.next()) {
                employee = new Employee();
                employee.setIdNhanVien(resultSet.getInt("idnhanvien"));
                employee.setHoTen(resultSet.getString("hoten"));
                employee.setNgaySinh(resultSet.getString("ngaysinh"));
                employee.setCmnd(resultSet.getString("socmtnd"));
                employee.setLuong(resultSet.getString("luong"));
                employee.setSdt(resultSet.getString("sdt"));
                employee.setEmail(resultSet.getString("email"));
                employee.setIdVitri_nv(resultSet.getInt("idvitri_nv"));
                employee.setIdTrinhDo_nv(resultSet.getInt("idtrinhdo_nv"));
                employeeList.add(employee);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return employeeList;
    }

    @Override
    public boolean createService(Service service) {
        int row =0;
        try {
            PreparedStatement preparedStatement = this.baseRepository.
                    getConnection().
                    prepareStatement("insert into dichvu(`tendichvu`,dientich,songuoitoida,chiphuthue,idkieuthue_dv) value (?,?,?,?,?) ");
            preparedStatement.setString(1,service.getTendichvu());
            preparedStatement.setInt(2,service.getDientich());
            preparedStatement.setString(3,service.getSonguoitoida());
            preparedStatement.setString(4,service.getChiphithue());
            preparedStatement.setInt(5,service.getIdkieuthue_dv());
            row = preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return row >0;
    }

    @Override
    public boolean deleteEmployee(int id) {
        int row = 0;
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection().
                    prepareStatement("delete  from nhanvien where idnhanvien=?");
            preparedStatement.setInt(1, id);
            row = preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return row > 0;
    }

    @Override
    public boolean createContract(Contract contract) {
        int row =0;
        try {
            PreparedStatement preparedStatement = this.baseRepository.
                    getConnection().
                    prepareStatement("insert into hopdong(`ngaylamhopdong`,ngayketthuc,tiendatcoc,tongtien,idnhanvien_hd,idkhachhang_hd,iddichvu_hd) value (?,?,?,?,?,?,?) ");
            preparedStatement.setString(1,contract.getNgaylamhopdong());
            preparedStatement.setString(2,contract.getNgayketthuc());
            preparedStatement.setInt(3,contract.getTiendatcoc());
            preparedStatement.setInt(4,contract.getTongtien());
            preparedStatement.setInt(5,contract.getIdnhanvien_hd());
            preparedStatement.setInt(6,contract.getIdkhachhang_hd());
            preparedStatement.setInt(7,contract.getIddichvu_hd());
            row = preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return row >0;
    }

    @Override
    public boolean createContractDetail(ContractDetail contractDetail) {
        int row =0;
        try {
            PreparedStatement preparedStatement = this.baseRepository.
                    getConnection().
                    prepareStatement("insert into hopdongchitiet(`soluong`,iddichvudikem_hdct,idhopdong_hdct) value (?,?,?) ");
            preparedStatement.setInt(1,contractDetail.getSoluong());
            preparedStatement.setInt(2,contractDetail.getIddichvudikem_hdct());
            preparedStatement.setInt(3,contractDetail.getIdhopdong_hdct());
            row = preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return row >0;
    }

    @Override
    public List<UserService> findUserService() {
        List<UserService> userServices = new ArrayList<>();
        try {
            Statement statement = this.baseRepository.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery("select kh.idkhachhang,kh.hoten, hd.idhopdong,hdct.idhopdongchitiet, dvdk.tendichvudikem\n" +
                    "from khachhang kh\n" +
                    "inner join hopdong hd on hd.idkhachhang_hd = kh.idkhachhang\n" +
                    "inner join hopdongchitiet hdct on hdct.idhopdong_hdct = hd.idhopdong\n" +
                    "inner join dichvudikem dvdk on dvdk.iddichvudikem = hdct.iddichvudikem_hdct\n" +
                    "group by kh.idkhachhang;");
            UserService service = null;
            while (resultSet.next()) {
                service = new UserService();
                service.setIdkhachhang(resultSet.getInt("kh.idkhachhang"));
                service.setHoten(resultSet.getString("kh.hoten"));
                service.setIdhopdong(resultSet.getInt("hd.idhopdong"));
                service.setIdhopdongchitiet(resultSet.getInt("hdct.idhopdongchitiet"));
                service.setTendichvudikem(resultSet.getString("dvdk.tendichvudikem"));
                userServices.add(service);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return userServices;
    }

    @Override
    public Login checkLogin(String username, String password) {
        try {
            PreparedStatement preparedStatement = this.baseRepository.
                    getConnection().
                    prepareStatement("select * from login where `user` =? and pass=?");
            preparedStatement.setString(1,username);
            preparedStatement.setString(2,password);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
              Login login = new Login(resultSet.getString(1),resultSet.getString(2));
              return login;
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean createUser(Login login) {
        int row = 0;
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection().prepareStatement
                    ("insert into login (`user`,pass) values \n" +
                            "(?,?);");
            preparedStatement.setString(1, login.getUsername());
            preparedStatement.setString(2, login.getPassword());
            row = preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return row > 0;
    }
}
