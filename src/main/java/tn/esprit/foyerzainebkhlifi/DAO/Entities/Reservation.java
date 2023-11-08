package tn.esprit.foyerzainebkhlifi.DAO.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Reservation {
  @Id
  private long idReservation;
  private Date anneUniversitaire;
  private Boolean estValide;





}
