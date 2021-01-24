package Services;

import Model.Addresses;
import Model.User;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AdressService {

    public void CreateAddress(Addresses address){
        String query = String.format("INSERT INTO `Addresses` (`idAddresses`,`Street`, `HouseNumber`, `Zipcode`, `City`) VALUES (%s, '%s', '%s', '%s', '%s')",null ,address.getStreet(), address.getHouseNumber(), address.getZipcode(),address.getCity());
        DatabaseService.execute(query);
    }

    public Addresses getAddressByUserID(int userID) {
       String testID = "110"; // testowe id jak narazie w bazie nie ma userID
        String query = String.format("SELECT * From Addresses where HouseNumber='%s'",testID );
        ResultSet rs = DatabaseService.executeQuery(query);

        try {
            while (rs.next()) {
                String street = rs.getString("Street");
                String houseNumber = rs.getString("HouseNumber");
                String zipCode = rs.getString("Zipcode");
                String city = rs.getString("City");

                Addresses adress = new Addresses(street,houseNumber,zipCode,city);
                rs.close();
                return adress;
            }

        } catch (SQLException sqlException){
            System.out.println(sqlException);
        }
        return null;
    }

    public void updateAddress(Addresses address,String adressID){
        String testID = "12"; // testowe id jak narazie w bazie nie ma userID
            String query= String.format("Update Addresses set Street = '%s',City='%s',Zipcode='%s',HouseNumber='%s' where HouseNumber='wtt'",address.getStreet(),address.getCity(),address.getZipcode(),address.getHouseNumber());
        DatabaseService.execute(query);

    }
}
