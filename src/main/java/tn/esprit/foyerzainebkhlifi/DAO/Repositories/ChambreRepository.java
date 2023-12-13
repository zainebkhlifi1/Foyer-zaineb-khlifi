package tn.esprit.foyerzainebkhlifi.DAO.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.foyerzainebkhlifi.DAO.Entities.Bloc;
import tn.esprit.foyerzainebkhlifi.DAO.Entities.Chambre;
import tn.esprit.foyerzainebkhlifi.DAO.Entities.TypeChambre;

import java.util.List;

public interface ChambreRepository extends JpaRepository<Chambre,Long> {

    List<Chambre> findByNumeroChambre(long numeroChambre);
    List<Chambre> findByCh(TypeChambre ch);
    List<Chambre> findChambreByBloc(Bloc bloc);
    List<Chambre> findChambreByBlocAndCh(Bloc bloc,TypeChambre ch);
    List<Chambre> findChambreByNumeroChambreAndCh(long numeroChambre,TypeChambre ch);




}
