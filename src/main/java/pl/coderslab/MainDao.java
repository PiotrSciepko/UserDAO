package pl.coderslab;

import java.sql.Connection;
import java.sql.SQLException;

public class MainDao {

    public static void main(String[] args) {
        try {
            Connection conn = DbUtil.getConnection();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
}
