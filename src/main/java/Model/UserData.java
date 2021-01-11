package Model;

public class UserData {

    private String name;
    private String sourname;
    private int addressId;
    private int userId;



    public UserData(String _name, String _sourname, int _adressId, int _userid) {
        name = _name;
        sourname = _sourname;
        addressId = _adressId;
        userId = _userid;
    }

    public String getName(){
        return name;
    }

    public String getSourname(){
        return sourname;
    }

    public int getAddressId(){
        return addressId;
    }

    public int getUserId(){
        return userId;
    }

}

