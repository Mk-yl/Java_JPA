package fr.epsi.b3devc2;

import fr.epsi.b3devc2.dao.LivreDAO;
import fr.epsi.b3devc2.entites.Livre;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;


public class Main {
    public static void main(String[] args) {
        LivreDAO dao = new LivreDAO();
        Livre livre = dao.findById(1L);
        if (livre != null) {
            System.out.println("Livre trouvé : " + livre.getTitre() + " de " + livre.getAuteur());
        } else {
            System.out.println("Livre non trouvé.");
        }


        Livre livre1 = new Livre();

        livre1.setTitre("Le Seigneur des Anneaux");
        livre1.setAuteur("J.R.R. Tolkien");


        dao.create(livre1);

        Livre livre2 = dao.findById(2L);
        if (livre2 != null) {
            System.out.println("Livre trouvé : " + livre2.getTitre() + " de " + livre2.getAuteur());
        } else {
            System.out.println("Livre non trouvé.");
        }





    }
}
