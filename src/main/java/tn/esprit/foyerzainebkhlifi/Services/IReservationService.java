package tn.esprit.foyerzainebkhlifi.Services;

import tn.esprit.foyerzainebkhlifi.DAO.Entities.Reservation;

import java.util.List;

public interface IReservationService {
    List<Reservation> getAllReservations();
    Reservation addReservation(Reservation e);
    void removeReservation(String id);
    Reservation modifyReservation(Reservation e, String id);







}
