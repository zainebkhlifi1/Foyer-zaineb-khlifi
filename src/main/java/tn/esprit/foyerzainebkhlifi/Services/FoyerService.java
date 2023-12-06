package tn.esprit.foyerzainebkhlifi.Services;

import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import tn.esprit.foyerzainebkhlifi.DAO.Entities.Foyer;
import tn.esprit.foyerzainebkhlifi.DAO.Repositories.FoyerRepository;

import java.util.List;

@Primary
@Service("FoyerService")
@AllArgsConstructor
public class FoyerService implements IFoyerService{
    FoyerRepository foyerRepository;

    @Override
    public List<Foyer> getAllFoyers() {
        return foyerRepository.findAll();
    }

    @Override
    public Foyer addFoyer(Foyer e) {
        return foyerRepository.save(e);
    }

    @Override
    public void removeFoyer(long id) {
foyerRepository.deleteById(id);
    }

    @Override
    public Foyer modifyFoyer(Foyer e, long id) {
        Foyer foyerToModify = foyerRepository.findById(id).orElse(null);

        if (foyerToModify != null) {
            foyerToModify.setNom(e.getNom());
            foyerToModify.setCapacite(e.getCapacite());

            return foyerRepository.save(foyerToModify);
        } else {
            throw new EntityNotFoundException("Foyer with id " + id + " not found");
        }
    }
}
