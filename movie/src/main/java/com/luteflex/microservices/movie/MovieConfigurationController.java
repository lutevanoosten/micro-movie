package com.luteflex.microservices.movie;

import com.luteflex.microservices.movie.Models.Movie;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(value = "*")
@RestController
public class MovieConfigurationController
{
    @PostMapping(path = "/movie/upload", produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean upload(@RequestBody Movie movie) throws Exception {

        return new MovieConfiguration().upload(movie);
    }

    @GetMapping(path = "/movie/search/{keyword}", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Movie> search(@PathVariable String keyword) {

        return new MovieConfiguration().searchMovies(keyword);
    }

    @GetMapping(path = "/movie/get", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Movie> get() throws Exception {

        return new MovieConfiguration().getMovies();
    }

    @DeleteMapping(value = "/movie/delete/{id}")
    public boolean deleteImage(@PathVariable int id){
        // Claims claims = JWT.parseJWT(token);
        System.out.print("eyy delete that shiii");
        return new MovieConfiguration().removeMovie(id);
    }
}