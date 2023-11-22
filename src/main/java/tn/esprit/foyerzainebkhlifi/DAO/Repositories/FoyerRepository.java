package tn.esprit.foyerzainebkhlifi.DAO.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.foyerzainebkhlifi.DAO.Entities.Bloc;
import tn.esprit.foyerzainebkhlifi.DAO.Entities.Foyer;

public interface FoyerRepository extends JpaRepository<Foyer,Long> {
}
