package tn.esprit.foyerzainebkhlifi.Services;

import tn.esprit.foyerzainebkhlifi.DAO.Entities.Foyer;

import java.util.List;

public interface IFoyerService {

    List<Foyer> getAllFoyers();
    Foyer addFoyer(Foyer e);
    void removeFoyer(long id);
    Foyer modifyFoyer(Foyer e, long id);


}
