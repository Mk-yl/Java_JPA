package fr.epsi.b3devc2.entites;

import jakarta.persistence.*;
import java.util.Set;

@Entity
@Table(name = "CLIENT")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private String prenom;

    @OneToMany(mappedBy = "client", fetch = FetchType.LAZY)
    private Set<Emprunt> emprunts;

    public Client() {
    }

    // Getters et Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }

    public String getPrenom() { return prenom; }
    public void setPrenom(String prenom) { this.prenom = prenom; }

    public Set<Emprunt> getEmprunts() { return emprunts; }
    public void setEmprunts(Set<Emprunt> emprunts) { this.emprunts = emprunts; }
}
