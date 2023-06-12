package com.sivaram.spring.catalog.resource;


import com.sivaram.spring.catalog.model.CatalogItem;
import com.sivaram.spring.catalog.model.MovieInfo;
import com.sivaram.spring.catalog.model.Rating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/catalog")
public class CatalogResource {

    @Autowired
    public RestTemplate restTemplate ;

    @RequestMapping("/{userId}")
    public List<CatalogItem> getMovieCatalog(@PathVariable("userId") String userid) {


        //Get the list of ratings
        List<Rating> ratings = Arrays.asList(new Rating("transformer", 4f),
                new Rating("HarryPorter", 4.5f));

        //Get the Movie info of each rated Movie
        return ratings.stream().map(rating -> {
                    MovieInfo movieInfo = restTemplate.getForObject("http://localhost:8082/movie/" + rating.getMovieName(), MovieInfo.class);
                    return new CatalogItem(movieInfo.getMovieId(), movieInfo.getMovieName(), movieInfo.getMovieDescription(), rating.getRating());
                }

        ).collect(Collectors.toList());

    }
}
