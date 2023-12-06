package tn.esprit.foyerzainebkhlifi.DAO.Entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.Set;

@Entity
@Data
public class Etudiant {

 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)// AUTO-INCREMENT -->l'id est generer automatiquement de la staratigie de la BD
 private long idEtudiant;
 private String nomET;
    private String prenomEt;
    private long cin;
    private String ecole;
    private Date dateNaissance;

    @ManyToMany(mappedBy="etudiants", cascade = CascadeType.ALL)
    private Set<Reservation> reservations;


}
