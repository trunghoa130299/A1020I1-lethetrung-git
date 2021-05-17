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
            Statement statement = this.baseRepository.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery("select * \n" +
                    "from users;");
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
    public boolean saveUserTransaction(User user) {
        int row = 0;
        Connection connection = this.baseRepository.getConnection();
        try {
            connection.setAutoCommit(false);
            PreparedStatement preparedStatement1 = connection.prepareStatement
                    ("insert into users (`name`,email,country) values \n" +
                    "(?,?,?);");
            preparedStatement1.setString(1,user.getName());
            preparedStatement1.setString(2,user.getEmail());
            preparedStatement1.setString(3,user.getCountry());
            row = preparedStatement1.executeUpdate();
            if (row ==1) {
                PreparedStatement preparedStatement2 = connection.prepareStatement
                        ("insert into users (`name`,email,country) values \n" +
                                "(?,?,?);");
                preparedStatement2.setString(1, user.getName());
                preparedStatement2.setString(2, user.getEmail());
                preparedStatement2.setString(3, user.getCountry());
                row += preparedStatement2.executeUpdate();
            }
            if (row==2){
                connection.commit();
            }else {
                connection.rollback();
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return false;
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
            PreparedStatement preparedStatement = this.baseRepository.getConnection().prepareStatement("update users\n" +
                    "set `name` = ? , email= ?,country =?\n" +
                    "where id =?;");
            preparedStatement.setString(1,user.getName());
            preparedStatement.setString(2,user.getEmail());
            preparedStatement.setString(3,user.getCountry());
            preparedStatement.setInt(4,user.getId());
            row = preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return row > 0;
    }

    @Override
    public boolean delete(int id) {
        int row =0;
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection().prepareStatement("delete  from users where id=?");
            preparedStatement.setInt(1,id);
            row=preparedStatement.executeUpdate();
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
