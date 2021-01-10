package Model;

import java.util.Date;

public class Advertisement {

    public String getName() {
        return Name;
    }

    public int getCategory() {
        return Category;
    }

    public String getPrice() {
        return Price;
    }

    public String getDescription() {
        return Description;
    }

    public String getCreateDate() {
        return CreateDate;
    }

    public String getFinishDate() {
        return FinishDate;
    }

    public int getUser_idUser() {
        return User_idUser;
    }

    public int getArchive_idUserFinish() {
        return Archive_idUserFinish;
    }

    private String Name;
    private int Category;
    private String Price;
    private String Description;
    private String CreateDate;
    private String FinishDate;
    private int User_idUser;
    private int Archive_idUserFinish;

    public Advertisement(String _name, int _category, String _price, String _description, String _createDate, String _finishDate, int _user_idUser, int _Archive_idUserFinish) {
        Name = _name;
        Category = _category;
        Price = _price;
        Description = _description;
        CreateDate = _createDate;
        FinishDate = _finishDate;
        User_idUser = _user_idUser;
    }

    public Advertisement(String _name, int _category, String _price, String _description){
        Name = _name;
        Category = _category;
        Price = _price;
        Description = _description;
    }

    @Override
    public String toString() {
        return "Advertisement{" +
                "Name='" + Name + '\'' +
                ", Category='" + Category + '\'' +
                ", Price='" + Price + '\'' +
                ", Description='" + Description + '\'' +
                '}';
    }

}
