package tn.esprit.foyerzainebkhlifi.Services;

import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import tn.esprit.foyerzainebkhlifi.DAO.Entities.Reservation;
import tn.esprit.foyerzainebkhlifi.DAO.Repositories.ReservationRepository;

import java.util.List;
@Primary
@Service("ReservationService")
@AllArgsConstructor
public class ReservationService implements IReservationService{
    ReservationRepository reservationRepository;

    @Override
    public List<Reservation> getAllReservations() {
        return reservationRepository.findAll();
    }

    @Override
    public Reservation addReservation(Reservation e) {
        return reservationRepository.save(e);
    }

    @Override
    public void removeReservation(String id) {
        reservationRepository.deleteById(Long.valueOf(id));
    }

    @Override
    public Reservation modifyReservation(Reservation updatedReservation, String id) {
        Reservation reservationToModify = reservationRepository.findById(Long.valueOf(id)).orElse(null);

        if (reservationToModify != null) {
            reservationToModify.setAnneeUniversitaire(updatedReservation.getAnneeUniversitaire());
            reservationToModify.setEstValide(updatedReservation.getEstValide());

            return reservationRepository.save(reservationToModify);
        } else {
            throw new EntityNotFoundException("Reservation with ID " + id + " not found");
        }
    }}
