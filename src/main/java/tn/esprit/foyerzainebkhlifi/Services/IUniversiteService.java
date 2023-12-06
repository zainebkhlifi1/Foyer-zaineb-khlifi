package tn.esprit.foyerzainebkhlifi.Services;

import tn.esprit.foyerzainebkhlifi.DAO.Entities.Universite;

import java.util.List;

public interface IUniversiteService {
    List<Universite> getAllUniversites();
    Universite addUniversite(Universite e);
    void removeUniversite(long id);
    Universite modifyUniversite(Universite e, long id);




}
