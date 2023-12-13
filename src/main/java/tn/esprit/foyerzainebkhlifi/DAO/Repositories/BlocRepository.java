package tn.esprit.foyerzainebkhlifi.DAO.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.foyerzainebkhlifi.DAO.Entities.Bloc;

public interface BlocRepository extends JpaRepository<Bloc,Long> {

    Bloc findByNomBloc(String nomBloc);
    Bloc getByCapaciteBloc(int capacite);
    Bloc findByNomBlocIgnoreCase(String nomBloc);
    Bloc getByCapaciteBlocGreaterThan(int capaciteBloc);
    Bloc findByNomBlocContains(String nomBloc);
    Bloc findByNomBlocOrderByNomBloc(String nomBloc);

    








}
