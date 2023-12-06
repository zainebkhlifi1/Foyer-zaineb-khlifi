package tn.esprit.foyerzainebkhlifi.Services;

import tn.esprit.foyerzainebkhlifi.DAO.Entities.Etudiant;

import java.util.List;

public interface IEtudiantService {

    List<Etudiant> getAllEtudiants();
    Etudiant addEtudiant(Etudiant e);
    void removeEtudiant(long id);
    Etudiant modifyEtudiant(Etudiant e, long id);



}
