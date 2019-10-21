package service;

import dao.AccountDAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AccountService {

    private List<Integer> list = new ArrayList<>();
    private AccountDAO accountDAO = new AccountDAO();

    public List<Integer> getAllAccounts() {
        try {
            ResultSet resultSet = accountDAO.getAccount();
            while (resultSet.next()) {
                list.add(resultSet.getInt("account"));
            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            accountDAO.conClose();
        }
        return null;
    }
}
