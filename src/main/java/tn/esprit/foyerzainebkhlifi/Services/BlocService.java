package tn.esprit.foyerzainebkhlifi.Services;

import org.springframework.stereotype.Service;
import tn.esprit.foyerzainebkhlifi.DAO.Entities.Bloc;
import tn.esprit.foyerzainebkhlifi.DAO.Repositories.BlocRepository;

import java.util.List;
@Service
public class BlocService implements IBlocService {
    BlocRepository blocRepository;
    // save : ajout et modif
    @Override
    public Bloc addBloc(Bloc b) {
        return blocRepository.save(b);

    }

    @Override
    public List<Bloc> addAllBlocs(List<Bloc> blocs) {
        return  blocRepository.saveAll(blocs);
    }

    @Override
    public Bloc updateBloc(Bloc b) {
        return blocRepository.save(b);
    }

    @Override
    public List<Bloc> updateAllBlocs(List<Bloc> blocs) {
        return  blocRepository.saveAll(blocs);

    }
    @Override
    public List<Bloc> findAllBlocs() {
        return  blocRepository.findAll();
    }

    @Override
    public Bloc findBlocById(long id) {
        //optional<Bloc>: retour de null
        //pourreseoudre le prob : .get() ou .orElse(..)
        //.get() --> retourne un resultat si elle a triuvé une ligne avec l'id passé en parametre
        //         --> si nn retourne un objet vide avec l'extension "No value present"
        //.orElse() --> retourne un resultat si elle a triuvé une ligne avec l'id passé en parametre
        //          --> (ena je definis l'objet retourner au cas ou la db ne retoirne pas une ligne avec l'id passé en parametre)

        //return blocRepository.findById(id).get();
        return blocRepository.findById(id).orElse(Bloc.builder().idBloc(0).nomBloc("bloc bizarre").build());
    }

    @Override
    public void deleteBloc(Bloc b) {
        blocRepository.delete(b);
    }

    @Override
    public void deleteBlocById(long id) {
        blocRepository.deleteById(id);
    }
}
