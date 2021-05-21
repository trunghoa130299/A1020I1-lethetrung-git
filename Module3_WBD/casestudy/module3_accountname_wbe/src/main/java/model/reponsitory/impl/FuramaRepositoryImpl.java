package model.reponsitory.impl;

import model.bean.Customer;
import model.reponsitory.BaseRepository;
import model.reponsitory.FuramaRepository;

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
}
