package Services;

import Model.Advertisement;

public class AdvertisementService {
    public void CreateAdvertisement(Advertisement adv) {
        String query = String.format("INSERT INTO `Advertisement` (`idAdvertisement`, `Name`, `Category`, `Price`, `Description`, `CreateDate`, `FinishDate`, `User_idUser`, `Archive_idUserFinish`) " +
                "VALUES (%d, '%s', '%d', '%s', '%s', '%s', '%s', %d, %d)",null, adv.getName(), adv.getCategory(), adv.getPrice(), adv.getDescription(),adv.getCreateDate(),adv.getFinishDate(),adv.getUser_idUser(),adv.getArchive_idUserFinish());
        DatabaseService.execute(query);
    }

    public void deleteAdvertisement(int id){
        String query = String.format("DELETE FROM `Advertisement` WHERE idAdvertisement=%d",id);
        DatabaseService.execute(query);
    }
}
