package fr.epsi.b3devc2.dao;

import fr.epsi.b3devc2.entites.Livre;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;



public class LivreDAO {
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("Java_JPA");

    public Livre findById(Long id) {
        EntityManager em = emf.createEntityManager();
        Livre livre = em.find(Livre.class, id);
        em.close();
        return livre;
    }

    public void create(Livre livre) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(livre);
        em.getTransaction().commit();
        em.close();
    }

}
