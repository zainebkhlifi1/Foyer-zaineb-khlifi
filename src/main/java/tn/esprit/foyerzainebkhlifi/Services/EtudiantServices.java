package tn.esprit.foyerzainebkhlifi.Services;

import org.springframework.stereotype.Service;
import tn.esprit.foyerzainebkhlifi.DAO.Entities.Etudiant;
import tn.esprit.foyerzainebkhlifi.DAO.Repositories.EtudiantRepository;
import tn.esprit.foyerzainebkhlifi.Services.IEtudiantService;

import java.util.Collections;
import java.util.List;
@Service
public class EtudiantServices implements IEtudiantService {
    EtudiantRepository etudiantRepository;
    @Override
    public List<Etudiant> getAllEtudiants() {
        return etudiantRepository.findAll();
    }

    @Override
    public Etudiant addEtudiant(Etudiant e) {
        return etudiantRepository.save(e);
    }

    @Override
    public void removeEtudiant(long id) {
        etudiantRepository.deleteById(id);
    }

    @Override
    public Etudiant modifyEtudiant(Etudiant e, long id) {
        Etudiant eModify = etudiantRepository.findById(id).get();
        eModify.setNomET(e.getNomET());
        eModify.setPrenomEt(e.getPrenomEt());
        eModify.setCin(e.getCin());
        eModify.setEcole(e.getEcole());
        return etudiantRepository.save(eModify);
    }
}
