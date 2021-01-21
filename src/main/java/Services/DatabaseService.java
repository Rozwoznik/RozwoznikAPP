package Services;

import java.sql.*;

public class DatabaseService {
    static Connection connection;
    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            connection = DriverManager.getConnection("jdbc:mysql://192.168.192.172:3306/rozwoznik?user=kacper&password=admin&useUnicode=true&characterEncoding=UTF-8");
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }
    DatabaseService(){}
    public static ResultSet executeQuery(String query){
        try {
            Statement statement = connection.createStatement();
            return statement.executeQuery(query);
        } catch (SQLException sqlException){
            System.out.println(sqlException);
        }
        return null;
    }

    public static boolean execute(String query){
        try {
            Statement statement = connection.createStatement();
            return statement.execute(query);
        } catch (SQLException sqlException){
            System.out.println(sqlException);
        }
        return false;
    }
}
