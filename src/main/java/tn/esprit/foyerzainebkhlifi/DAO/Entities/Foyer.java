package tn.esprit.foyerzainebkhlifi.DAO.Entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
@Data
public class Foyer {
@Id

@GeneratedValue(strategy = GenerationType.IDENTITY)// AUTO-INCREMENT -->l'id est generer automatiquement de la staratigie de la BD

private long id;
private String Nom;
private long Capacite;

@JsonIgnoreProperties("foyer")
@OneToOne(mappedBy="foyer")
Universite universite;

@OneToMany(cascade = CascadeType.ALL, mappedBy="foyer")
    Set<Bloc> blocs;

}
