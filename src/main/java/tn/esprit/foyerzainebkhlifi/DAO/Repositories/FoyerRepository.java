package tn.esprit.foyerzainebkhlifi.DAO.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.foyerzainebkhlifi.DAO.Entities.Bloc;
import tn.esprit.foyerzainebkhlifi.DAO.Entities.Foyer;

import java.util.List;
import java.util.Set;

public interface FoyerRepository extends JpaRepository<Foyer,Long> {

    List<Foyer> findByBlocs(Long id);
    List<Foyer> findFoyerByIdAndBlocs(long id, Set<Bloc> blocs);







}
