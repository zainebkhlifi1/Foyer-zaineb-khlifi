package tn.esprit.foyerzainebkhlifi.Services;

import tn.esprit.foyerzainebkhlifi.DAO.Entities.Chambre;

import java.util.List;

public interface IChambreService {
    List<Chambre> getAllChambres();
    Chambre addChambre(Chambre e);
    void removeChambre(long id);
    Chambre modifyChambre(Chambre e, long id);


}
