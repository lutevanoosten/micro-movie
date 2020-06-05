package com.luteflex.microservices.movie;


import com.luteflex.microservices.movie.DataAccess.MovieRepo;
import com.luteflex.microservices.movie.Models.Movie;

import java.util.List;


public class MovieConfiguration
{
   //bla bla get it from the database
   //private Sender sender = new Sender();
   //private Receiver receiver = new Receiver();
    private MovieRepo movieRepo = new MovieRepo();
    //TokenRequest user = new TokenRequest("200", "Lute", "Admin", "something.png");

  //  public String signIn(User user) throws Exception {
      //  User u = userRepo.login(user);
      //  if (u != null){
      //      sender.requestToken(new TokenRequest(u.getId(), u.getName(), u.getRole(), u.getAvatar()));
       //     return Receiver.gettoken(u.getName());
       // } else {
       //     return "De inloggegevens zijn incorrect, probeer het opnieuw of maak een account aan.";
       // }
    //}

    boolean upload(Movie movie) throws Exception {
        movieRepo.create(movie);


        return true;
    }

    List<Movie> searchMovies(String keyword){
        return movieRepo.searchMovies(keyword);
    }

    List<Movie> getMovies(){
        return movieRepo.getMovies();
    }

    boolean removeMovie(int id){
        movieRepo.deleteMovie(id);
        return true;
    }

}