package request;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import connection.*;

public class RequestClass {

    private static Connection connection = ConnectionClass.getConnection();

    public static String getRichestUser() {
        String name = null;
        String surname = null;

        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT name, surname FROM User JOIN account ON user.userid = account.userid WHERE account = (SELECT MAX(account) from Account); ");
            while (rs.next()) {
                name = rs.getString("name");
                surname = rs.getString("surname");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return name + "&nbsp;" + surname;
    }

    public static int getListOfAccounts() {
        int sum = 0;

        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT SUM(account) FROM Account");
            rs.next();
            sum = rs.getInt("SUM(account)");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return sum;
    }
}
