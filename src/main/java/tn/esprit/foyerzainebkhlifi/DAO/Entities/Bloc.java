package tn.esprit.foyerzainebkhlifi.DAO.Entities;

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
@Builder
public class Bloc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)// AUTO-INCREMENT -->l'id est generer automatiquement de la staratigie de la BD

    private long idBloc;
    private String nomBloc;
    private long capaciteBloc;
@OneToMany(cascade = CascadeType.ALL,mappedBy = "bloc")


Set<Chambre> chambre;





}
