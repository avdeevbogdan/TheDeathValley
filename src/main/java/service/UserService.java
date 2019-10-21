package service;

import dao.UserDAO;
import entity.User;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserService {

    private UserDAO userDAO = new UserDAO();

    public User getUserById(int id) {
        try {
            ResultSet resultSet = userDAO.getUser(id);
            resultSet.next();
            User user = new User();
            user.setUserid(resultSet.getInt("userid"));
            user.setName((resultSet.getString("name")));
            user.setSurname((resultSet.getString("surname")));
            return user;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            userDAO.conClose();
        }
        return null;
    }
}
