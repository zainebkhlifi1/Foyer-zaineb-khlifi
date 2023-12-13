package tn.esprit.foyerzainebkhlifi.DAO.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.foyerzainebkhlifi.DAO.Entities.Bloc;
import tn.esprit.foyerzainebkhlifi.DAO.Entities.Etudiant;

import java.util.List;

public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {

    //select * from Etudiant where cin=
    List<Etudiant> findByCin(long cin );

    //slect * from Etudiant where nom like
    List<Etudiant> findByNomETContains(String nomET);

    List<Etudiant> findByNomETContaining(String nomET);












}
