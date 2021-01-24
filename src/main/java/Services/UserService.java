package Services;

import Model.UserData;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserService {

    public void CreateUserData(UserData _userData){
        String query = String.format("INSERT INTO `UserData` (`idUserData`, `Name`, `Lastname`, `Rating`, `User_idUser`, `Addresses_idAddresses`) VALUES (%d, '%s', '%s', '%d', '%d', '%d')",null ,_userData.getName(), _userData.getSourname(), 11,_userData.getUserId(),2);
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


    public void UpdateUserData(int id, UserData _userData){

        int userId = id ;
        String query= String.format("Update UserData set Name = '%s',Lastname='%s' where User_idUser='%d'",_userData.getName(),_userData.getSourname(),userId);
        DatabaseService.execute(query);
    }
}
