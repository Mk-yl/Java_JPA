package fr.epsi.b3devc2.entites;

import jakarta.persistence.*;
import java.util.Set;

@Entity
@Table(name = "LIVRE")
public class Livre {

    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "TITRE")
    private String titre;

    @Column(name = "AUTEUR")
    private String auteur;

    // Relation Many-to-Many avec la table COMPO
    @ManyToMany(mappedBy = "livres")
    private Set<Emprunt> emprunts;

    public Livre() {
    }

    // Getters et Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public Set<Emprunt> getEmprunts() {
        return emprunts;
    }

    public void setEmprunts(Set<Emprunt> emprunts) {
        this.emprunts = emprunts;
    }
}
