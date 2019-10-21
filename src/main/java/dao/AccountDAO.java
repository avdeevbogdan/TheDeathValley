package dao;

import java.sql.*;

import static connection.ConnectionClass.getConnection;

public class AccountDAO {

    private Connection connection = getConnection();

    public ResultSet getAccount() {
        String sql = "SELECT account FROM account";
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            return resultSet;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void conClose() {
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
