package Services;

import Model.User;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDataService {

    public void CreateUser(User user){
        String query = String.format("INSERT INTO `User` (`idUser`, `Username`, `Password`, `Email`) VALUES (%d, '%s', '%s', '%s')",null ,user.getUsername(), user.getPassword(), user.getEmail());
        DatabaseService.execute(query);
    }

    public void UpdataUserData(int id, User user){

    }

    public User getUserById(int id) {
        String query = String.format("SELECT * From User where idUser=%d", id);
        ResultSet rs = DatabaseService.executeQuery(query);
        try {
            while (rs.next()) {
                String userName = rs.getString("Username");
                String password = rs.getString("Password");
                String email = rs.getString("Email");
                rs.close();
                return new User(userName, password, email);
            }
        } catch (SQLException sqlException){
            System.out.println(sqlException);
        }
        return new User();
    }

    public String getUserPasswordByUserName(String username) {
        String query = String.format("SELECT Password From User where Username='%s'", username);
        ResultSet rs = DatabaseService.executeQuery(query);
        try {
            while (rs.next()) {
                String password = rs.getString("Password");
                rs.close();
                return password;
            }
        } catch (SQLException sqlException){
            System.out.println(sqlException);
        }
        return "";
    }

    public boolean existUserInDatabase(String username){
        String query = String.format("SELECT Password From User where Username='%s'", username);
        ResultSet rs = DatabaseService.executeQuery(query);
        try {
            while (rs.next()) {
                rs.close();
                return true;
            }
        } catch (SQLException sqlException){
            System.out.println(sqlException);
        }
        return false;
    }

    public void deleteUser(int id){
        String query = String.format("DELETE FROM `User` WHERE `User`.`idUser` = %d",id);
        DatabaseService.executeQuery(query);
    }
}
