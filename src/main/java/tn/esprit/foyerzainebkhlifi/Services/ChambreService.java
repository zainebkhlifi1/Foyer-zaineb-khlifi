package tn.esprit.foyerzainebkhlifi.Services;

import jakarta.persistence.EntityNotFoundException;
import tn.esprit.foyerzainebkhlifi.DAO.Entities.Chambre;
import tn.esprit.foyerzainebkhlifi.DAO.Repositories.ChambreRepository;

import java.util.List;

public class ChambreService implements IChambreService {
    ChambreRepository chambreRepository;

    @Override
    public List<Chambre> getAllChambres() {
        return chambreRepository.findAll();
    }

    @Override
    public Chambre addChambre(Chambre e) {
        return chambreRepository.save(e);
    }

    @Override
    public void removeChambre(long id) {
        chambreRepository.deleteById(id);
    }

    @Override
    public Chambre modifyChambre(Chambre e, long id) {
        Chambre chambreToModify = chambreRepository.findById(id).orElse(null);

        if (chambreToModify != null) {
            chambreToModify.getNumeroChambre();
            chambreToModify.setTypeC(e.getTypeC());
            return chambreRepository.save(chambreToModify);
        } else {
            throw new EntityNotFoundException("Chambre with id" + id + "not found");
        }
    }
}