package Model;

import java.util.Date;

public class Advertisement {

    private String Name;
    private String Category;
    private String Price;
    private String Description;
    private Date CreateDate;
    private Date FinishDate;
    private int User_idUser;
    private int Archive_idUserFinish;

    public Advertisement(String _name, String _category, String _price, String _description, Date _createDate, Date _finishDate, int _user_idUser, int _Archive_idUserFinish) {
        Name = _name;
        Category = _category;
        Price = _price;
        Description = _description;
        CreateDate = _createDate;
        FinishDate = _finishDate;
        User_idUser = _user_idUser;
    }

}
