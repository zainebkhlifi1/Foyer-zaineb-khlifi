package tn.esprit.foyerzainebkhlifi.Services;

import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import tn.esprit.foyerzainebkhlifi.DAO.Entities.Universite;
import tn.esprit.foyerzainebkhlifi.DAO.Repositories.UniversiteRepository;

import java.util.Collections;
import java.util.List;

@Primary
@Service("UniversiteService")
@AllArgsConstructor


public class UniversiteService implements IUniversiteService {
    UniversiteRepository universiteRepository;
    FoyerService foyerService;
    @Override
    public List<Universite> getAllUniversites() {
        return universiteRepository.findAll();
    }

    @Override
    public Universite addUniversite(Universite e) {
        if(e.getFoyer() != null){
            foyerService.addFoyer(e.getFoyer());
        }
        return universiteRepository.save(e);    }

    @Override
    public void removeUniversite(long id) {
universiteRepository.deleteAllById(Collections.singleton(id));
    }

    @Override
    public Universite modifyUniversite(Universite e, long id) {
        Universite universiteToModify = universiteRepository.findById(id).orElse(null);

        if (universiteToModify != null) {
            universiteToModify.setNomUniversite(e.getNomUniversite());
            universiteToModify.setAddresse(e.getAddresse());

            return universiteRepository.save(universiteToModify);
        } else {
            throw new EntityNotFoundException("Universite with ID " + id + " not found");
        }
    }
}
