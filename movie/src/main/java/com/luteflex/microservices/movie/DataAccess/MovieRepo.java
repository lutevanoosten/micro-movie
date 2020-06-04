package com.luteflex.microservices.movie.DataAccess;

import com.luteflex.microservices.movie.Models.Movie;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class MovieRepo {
    private EntityManager em;
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("repoPU");

    private void createEm(){
        if (em == null)
            em = emf.createEntityManager();
    }

    public void create(Movie movie) {
        createEm();
        em.getTransaction().begin();
        em.persist(movie);
        em.getTransaction().commit();
    }


    //public User login(User user) {
    //    createEm();
    //    TypedQuery<User> query = em.createQuery(
    //            "select u from User u where u.email = :email and u.password = :password", User.class);
    //    query.setParameter("email", user.getEmail());
    //    query.setParameter("password", user.getPassword());
    //    return query.getSingleResult();
    //}
}
