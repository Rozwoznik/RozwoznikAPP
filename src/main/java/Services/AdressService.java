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
}
