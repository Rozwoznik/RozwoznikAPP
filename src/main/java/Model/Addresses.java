package Model;

public class Addresses {

    private String Street;
    private String HouseNumber;
    private String Zipcode;
    private String City;

    public Addresses(String _street, String _houseNumber, String _zipcode, String _city) {
        Street = _street;
        HouseNumber = _houseNumber;
        Zipcode = _zipcode;
        City = _city;
    }

    public String getStreet(){
        return Street;
    }

    public String getHouseNumber(){
        return HouseNumber;
    }

    public String getZipcode(){
        return Zipcode;
    }

    public String getCity(){
        return City;
    }
}
