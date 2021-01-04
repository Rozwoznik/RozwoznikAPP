package Model;

public class User {

    private String Username;
    private String Password;
    private String Email;
    private UserData userData;

    public User(String _Username, String _Password, String _Email){
        Username = _Username;
        Password = _Password;
        Email = _Email;
        userData = new UserData();
    }

    public User(String _Username, String _Password, String _Email, UserData userData){
        Username = _Username;
        Password = _Password;
        Email = _Email;
        this.userData = userData;
    }

    public User() {

    }
}
