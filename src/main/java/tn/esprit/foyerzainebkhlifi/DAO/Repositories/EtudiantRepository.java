package tn.esprit.foyerzainebkhlifi.DAO.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.foyerzainebkhlifi.DAO.Entities.Bloc;
import tn.esprit.foyerzainebkhlifi.DAO.Entities.Etudiant;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {

    Etudiant findByCin(long cin);

    @Override
    List<Etudiant> findAll();

    List<Etudiant> findByNomELike();
    List<Etudiant> findByNomEContains();
    List<Etudiant> findByNomEContaining();

    Etudiant findByNomEAndprenomE(String nom,String prenom);
    Etudiant findBycin(long cin);

    List<Etudiant> findByNaissanceGreaterThan(LocalDate date);

    List<Etudiant> findByecole(String nomEcole);

    List<Etudiant> findByReservationsIdReservation(long id);

    //6- Recherche des étudiants par réservation (année de réservation)
    List<Etudiant>findByReservationsAnneUniversitaire(Date anneeUniversitaire);

    List<Etudiant> findByNaissanceGreaterThanAndecole(LocalDate date,String nomEcole);

    List<Etudiant> findByReservationsAnneUniversitaireOrderByNaissance(Date anneeUniversitaire);











}
