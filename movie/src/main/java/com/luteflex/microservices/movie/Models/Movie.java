package com.luteflex.microservices.movie.Models;


import javax.persistence.*;

@Entity
@Table(name = "movies")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String titel;
    private String genre;
    private String beschrijving;
    private String cast;
    private String regiseur;
    private String poster;
    private String film;
    private String leeftijdbeperking;
    private String uitgevenjaar;

    public Movie(){}


    public Movie(int Id, String Titel, String Genre, String Beschrijving, String Cast, String Regiseur,
                 String Poster, String Film, String Leeftijdbeperking, String Uitgevenjaar) {


        id = Id;
        titel = Titel;
        genre = Genre;
        beschrijving = Beschrijving;
        cast = Cast;
        regiseur = Regiseur;
        poster = Poster;
        film = Film;
        leeftijdbeperking = Leeftijdbeperking;
        uitgevenjaar = Uitgevenjaar;
    }

    public int getId() { return id; }
    public String getTitel() { return titel; }
    public String getGenre() { return genre; }
    public String getBeschrijving() { return beschrijving; }
    public String getCast() { return cast; }
    public String getRegiseur() { return regiseur; }
    public String getPoster() { return poster; }
    public String getFilm() { return film; }
    public String getLeeftijdbeperking() { return leeftijdbeperking; }
    public String getUitgevenjaar() { return uitgevenjaar; }

}
