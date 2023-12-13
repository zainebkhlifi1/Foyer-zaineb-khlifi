package tn.esprit.foyerzainebkhlifi.DAO.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.foyerzainebkhlifi.DAO.Entities.Bloc;
import tn.esprit.foyerzainebkhlifi.DAO.Entities.Foyer;

import java.util.List;

public interface BlocRepository extends JpaRepository<Bloc,Long> {

    List<Bloc> findByNomBloc(String nomBloc);
    List<Bloc> getByCapacite(int capacite);
    List<Bloc> findByNomBlocIgnoreCase(String nomBloc);
    List<Bloc> getByCapaciteGreaterThan(int capacite);
    List<Bloc> findByNomBlocContains(String nomBloc);
    List<Bloc> findByNomBlocOrderByNomBloc(String nomBloc);
    List<Bloc> findByNomBlocOrCapacite(String nomBloc,int capacite);
    List<Bloc> findBlocByFoyer_Id(Foyer foyer);


    








}
