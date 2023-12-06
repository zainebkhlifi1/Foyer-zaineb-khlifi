package tn.esprit.foyerzainebkhlifi.DAO.Entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Data;

import java.util.Date;
import java.util.Set;

@Entity
@Data
public class Reservation {
  @Id
  private String idReservation;
  private Date anneeUniversitaire;
  private Boolean estValide;

  @ManyToMany(cascade = CascadeType.ALL)
  Set<Etudiant> etudiants;




}
