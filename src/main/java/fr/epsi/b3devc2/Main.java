package fr.epsi.b3devc2;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {

        try (EntityManagerFactory emf = Persistence.createEntityManagerFactory("Java_JPA");
             EntityManager em = emf.createEntityManager()) {
            System.out.println("ça marche!!!");
        }
    }

}

