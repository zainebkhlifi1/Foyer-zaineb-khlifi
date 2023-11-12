package tn.esprit.foyerzainebkhlifi.DAO.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class Reservation {
  @Id
  private long idReservation;
  private Date anneUniversitaire;
  private Boolean estValide;





}
