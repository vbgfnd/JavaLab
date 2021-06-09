import org.junit.Test;

import java.sql.*;

public class JDBCTest {

    @Test
    public void createNewDataBseTest() throws SQLException {
        String jdbcUrl = "jdbc:mysql://localhost:3306";
        String user = "root";
        String pass = "coding123";
        Connection conn = null;
        Statement statement = null;
        ResultSet resultSet = null;
        String sql = "CREATE DATABASE lymtest";
        try{
            conn = DriverManager.getConnection(jdbcUrl, user, pass);
            statement = conn.createStatement();
            statement.execute(sql);
        }finally {
            conn.close();
            statement.close();
        }
    }

    @Test
    public void createTable() throws SQLException {
        String jdbcUrl = "jdbc:mysql://localhost:3306";
        String user = "root";
        String pass = "coding123";
        Connection conn = null;
        Statement statement = null;
        ResultSet resultSet = null;
        String sql = "CREATE TABLE IF NOT EXISTS `testuser`(" +
                "`id` INT UNSIGNED AUTO_INCREMENT," +
                "`username` VARCHAR(100) NOT NULL," +
                "PRIMARY KEY (`id`)" +
                ")ENGINE=InnoDB Default CHARSET=utf8;";
        try{
            conn = DriverManager.getConnection(jdbcUrl, user, pass);
            statement = conn.createStatement();
            statement.execute("use lymtest");
            statement.execute(sql);
        }catch (SQLException se){
            se.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            conn.close();
            statement.close();
        }
    }
}
