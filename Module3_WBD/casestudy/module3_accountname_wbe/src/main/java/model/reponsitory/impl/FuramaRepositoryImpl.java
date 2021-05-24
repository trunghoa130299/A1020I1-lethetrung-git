package model.reponsitory.impl;

import model.bean.Customer;
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
            preparedStatement.setString(1,customer.getHoten());
            preparedStatement.setString(2,customer.getNgaySinh());
            preparedStatement.setString(3,customer.getCmnd());
            preparedStatement.setString(4,customer.getSdt());
            preparedStatement.setString(5,customer.getEmail());
            preparedStatement.setString(6,customer.getDiaChi());
            preparedStatement.setInt(7,customer.getIdLoaiKhach_kh());
            row = preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return row >0;
    }

    @Override
    public Customer findById(int id) {
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection().prepareStatement("select * \n" +
                    "from khachhang where idkhachhang =?");
            preparedStatement.setInt(1,id);
            ResultSet resultSet = preparedStatement.executeQuery();
            Customer customer = null;
            while (resultSet.next()){
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
        int row =0;
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection().prepareStatement("update khachhang\n" +
                    "set `hoten` = ? , ngaysinh= ?,socmtnd =?,sdt = ?,email= ?,diachi=?,idloaikhach_kh =?\n" +
                    "where idkhachhang =?;");
            preparedStatement.setString(1,customer.getHoten());
            preparedStatement.setString(2,customer.getNgaySinh());
            preparedStatement.setString(3,customer.getCmnd());
            preparedStatement.setString(4,customer.getSdt());
            preparedStatement.setString(5,customer.getEmail());
            preparedStatement.setString(6,customer.getDiaChi());
            preparedStatement.setInt(7,customer.getIdLoaiKhach_kh());
            preparedStatement.setInt(8,customer.getIdKhachHang());
            row = preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return row > 0;
    }

    @Override
    public boolean deleteCustomer(int id) {
        int row =0;
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection().
                    prepareStatement("delete  from khachhang where idkhachhang=?");
            preparedStatement.setInt(1,id);
            row=preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return row > 0;
    }
}
