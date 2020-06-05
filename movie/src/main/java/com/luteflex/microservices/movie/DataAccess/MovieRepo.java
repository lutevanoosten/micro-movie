package com.luteflex.microservices.movie.DataAccess;

import com.luteflex.microservices.movie.Models.Movie;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

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
        System.out.print("heeeeeeeeeeeeeeeeeeeeeeee");
    }



    public List<Movie> searchMovies(String keyword) {
        createEm();

        TypedQuery<Movie> query = em.createQuery(
                "select e from Movie e where e.titel like :keyword", Movie.class);
        query.setParameter("keyword", keyword);
        List<Movie> result = query.setFirstResult(0).setMaxResults(100).getResultList();
        em.clear();
        return result;

    }

    public List<Movie> getMovies() {
        createEm();
        TypedQuery<Movie> query = em.createQuery(
                "select e from Movie e", Movie.class);
        List<Movie> result = query.setFirstResult(0).setMaxResults(100).getResultList();
        em.clear();
        return result;

    }


    public void deleteMovie(int id) {
        createEm();
        Movie movie = em.find(Movie.class,id);
        em.getTransaction().begin();
        em.remove(movie);
        em.getTransaction().commit();
    }
}
