package tn.esprit.foyerzainebkhlifi.DAO.Entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Chambre {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)// AUTO-INCREMENT -->l'id est generer automatiquement de la staratigie de la BD

  private long idChambre;
  private long numeroChambre;
  private TypeChambre typeC;
  @OneToMany(cascade = CascadeType.ALL)
  Set<Reservation> reservations;

  @JsonIgnoreProperties("bloc")
  @ManyToOne
  Bloc bloc;

}


