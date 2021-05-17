package model.reponsitory;

import model.bean.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserReponsitoryImpl implements UserReponsitory {
    private BaseRepository baseRepository = new BaseRepository();
    @Override
    public List<User> findAll() {
        List<User> userList = new ArrayList<>();
        try {
            CallableStatement callableStatement = this.baseRepository.getConnection().prepareCall("call list_user");
            ResultSet resultSet = callableStatement.executeQuery();
            User user = null;
            while (resultSet.next()){
                user = new User();
                user.setId(resultSet.getInt("id"));
                user.setName(resultSet.getString("name"));
                user.setEmail(resultSet.getString("email"));
                user.setCountry(resultSet.getString("country"));
                userList.add(user);
            }
            return userList;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return  null;
        }
    }

    @Override
    public boolean save(User user) {
        int row = 0;
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection().prepareStatement
                    ("insert into users (`name`,email,country) values \n" +
                    "(?,?,?);");
            preparedStatement.setString(1,user.getName());
            preparedStatement.setString(2,user.getEmail());
            preparedStatement.setString(3,user.getCountry());
            row = preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return row >0;
    }

    @Override
    public User findById(int id) {
        try {
            CallableStatement callableStatement = this.baseRepository.getConnection().prepareCall("call get_user_by_id(?)");
            callableStatement.setInt(1,id);
            ResultSet resultSet = callableStatement.executeQuery();
            User user = null;
            while (resultSet.next()){
                user = new User();
                user.setId(resultSet.getInt("id"));
                user.setName(resultSet.getString("name"));
                user.setEmail(resultSet.getString("email"));
                user.setCountry(resultSet.getString("country"));
                return user;
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;

    }

    @Override
    public boolean update(int id ,User user) {
        int row =0;
        try {
            CallableStatement callableStatement = this.baseRepository.getConnection().
                    prepareCall("call update_user_by_id(?,?,?,?)");
            callableStatement.setString(1,user.getName());
            callableStatement.setString(2,user.getEmail());
            callableStatement.setString(3,user.getCountry());
            callableStatement.setInt(4,user.getId());
            row = callableStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return row > 0;
    }

    @Override
    public boolean delete(int id) {
        int row =0;
        try {
            CallableStatement callableStatement = this.baseRepository.getConnection().prepareCall("call delete_user_by_id(?)");
            callableStatement.setInt(1,id);
            row=callableStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return row > 0;
    }
    @Override
    public List<User> findByName(String name) {
        List<User> userList = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection().prepareStatement("select * \n" +
                    "from users where name =?");
            preparedStatement.setString(1,name);
            ResultSet resultSet = preparedStatement.executeQuery();
            User user = null;
            while (resultSet.next()){
                user = new User();
                user.setId(resultSet.getInt("id"));
                user.setName(resultSet.getString("name"));
                user.setEmail(resultSet.getString("email"));
                user.setCountry(resultSet.getString("country"));
                userList.add(user);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return userList;

    }
    public List<User> sortUser() {
        List<User> userList = new ArrayList<>();
        try {
            Statement statement = this.baseRepository.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery("select * \n" +
                    "from users\n" +
                    "order by `name`");
            User user = null;
            while (resultSet.next()){
                user = new User();
                user.setId(resultSet.getInt("id"));
                user.setName(resultSet.getString("name"));
                user.setEmail(resultSet.getString("email"));
                user.setCountry(resultSet.getString("country"));
                userList.add(user);
            }
            return userList;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return  null;
        }
    }

}
