package com.luteflex.microservices.movie;

import com.luteflex.microservices.movie.Models.Movie;
import com.luteflex.microservices.user.Models.User;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(value = "*")
@RestController
public class MovieConfigurationController
{






    @PostMapping(path = "/movie/upload", produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean register(@RequestBody Movie movie) throws Exception {

        return new MovieConfiguration().upload(movie);
    }
}