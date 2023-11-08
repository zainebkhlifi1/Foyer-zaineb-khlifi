package tn.esprit.foyerzainebkhlifi.DAO.Entities;

import jakarta.persistence.*;

@Entity
public class Foyer {
@Id

@GeneratedValue(strategy = GenerationType.IDENTITY)// AUTO-INCREMENT -->l'id est generer automatiquement de la staratigie de la BD

private long idFoyer;
private String nomFoyer;
private long capaciteFoyer;


}
