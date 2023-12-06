package tn.esprit.foyerzainebkhlifi.DAO.Entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Universite {

    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)// AUTO-INCREMENT -->l'id est generer automatiquement de la staratigie de la BD


    private long idUniversite;
    private String nomUniversite;
    private String addresse;
    @OneToOne
    Foyer foyer;
}
