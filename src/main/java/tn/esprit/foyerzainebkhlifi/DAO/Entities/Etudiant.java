package tn.esprit.foyerzainebkhlifi.DAO.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class Etudiant {

 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)// AUTO-INCREMENT -->l'id est generer automatiquement de la staratigie de la BD
 private long idEtudiant;
 private String nomET;
    private String prenoEt;
    private long cin;
    private String ecole;
    private Date dateNaissance;




}
