package Database;

import java.sql.*;

public class DBConnection {

    public static Connection Conectar() throws SQLException {
        
        Connection con = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("Erro! " + e.getMessage());
            return con;
        }

        try {
            String url = "jdbc:oracle:thin:@oracle.inf.poa.ifrs.edu.br:1521:XE";

            con = DriverManager.getConnection(url, "0605131", ".tomridel0594");
            return con;
        } catch (SQLException e) {

            e.printStackTrace();
            System.out.println("Erro2! " + e);
            return con;

        }

    }
}
