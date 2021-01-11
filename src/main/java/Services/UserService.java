package Services;

import Model.Addresses;
import Model.User;
import Model.UserData;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserService {

    public void CreateAddress(UserData _userData){
        String query = String.format("INSERT INTO `UserData` (`Name`,`Lastname`, `Rating`, `User_idUser`) VALUES (%s, '%s', '%d', '%d')",_userData.getName() ,_userData.getSourname(), null, _userData.getUserId());
        DatabaseService.execute(query);
    }

    public UserData getUserDataByUserID(int userID) {

        String query = String.format("SELECT * From UserData where User_idUser='%s'",userID );
        ResultSet rs = DatabaseService.executeQuery(query);
        try {
            while (rs.next()) {
                String name = rs.getString("Name");
                String sourName = rs.getString("Lastname");

       UserData userData = new UserData(name,sourName,0,4);
                rs.close();
                return userData;
            }

        } catch (SQLException sqlException){
            System.out.println(sqlException);
        }

        return null;
    }
}
