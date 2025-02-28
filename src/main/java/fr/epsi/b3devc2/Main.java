package fr.epsi.b3devc2;

import fr.epsi.b3devc2.entites.Client;
import fr.epsi.b3devc2.entites.Emprunt;
import fr.epsi.b3devc2.entites.Livre;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;


public class Main {
    public static void main(String[] args) {

        // Créer l'EntityManagerFactory et l'EntityManager
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Java_JPA");
        EntityManager em = emf.createEntityManager();

        // 1. Afficher un emprunt en fonction de son ID et ses livres associés
        int empruntId = 1;
        Emprunt emprunt = em.find(Emprunt.class, empruntId);
        System.out.println("Emprunt ID: " + emprunt.getId() + "," + emprunt.getDateDebut());
        System.out.println("Livres associés à cet emprunt :");
        for (Livre livre : emprunt.getLivres()) {
            System.out.println(" - " + livre.getTitre() + " -- " + livre.getAuteur());
        }

        // 2. afficher tout les emprunts d'un client
        int clientId = 3;
        Client client = em.find(Client.class, clientId);
        System.out.println("Emprunts de  " + client.getNom() + " " + client.getPrenom() + " :");
        for (Emprunt empruntClient : client.getEmprunts()) {
            System.out.println(" - Emprunt ID: " + empruntClient.getId() + "," + empruntClient.getDateDebut());
        }


        //
        em.close();
        emf.close();
    }
}
