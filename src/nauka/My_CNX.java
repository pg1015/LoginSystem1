package nauka;

import com.mysql.cj.jdbc.MysqlDataSource;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class My_CNX {

    private static String servername = "localhost";
    private static String username = "root";
    private static String dbname = "user_db";
    private static Integer portnumber = 3306;
    private static String password = "";

    public static Connection getConnection(){

        Connection cnx = null;

        MysqlDataSource dataSource = new MysqlDataSource();

        dataSource.setServerName(servername);
        dataSource.setUser(username);
        dataSource.setPassword(password);
        dataSource.setPortNumber(portnumber);
        dataSource.setDatabaseName(dbname);

        try {
            cnx = dataSource.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(" Get conneciton -> " + My_CNX.class.getName()).log(Level.SEVERE, null, ex);
        }
//
        return cnx;
    }
}
