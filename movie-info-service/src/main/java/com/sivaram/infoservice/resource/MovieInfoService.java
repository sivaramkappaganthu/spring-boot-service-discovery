package com.sivaram.infoservice.resource;

import com.sivaram.infoservice.model.MovieInfo;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/movie")
public class MovieInfoService {

    @RequestMapping("/{movieName}")
    public MovieInfo getMovieInfo(@PathVariable("movieName") String movieName){

        List<MovieInfo> movieInfos = Arrays.asList(new MovieInfo(1,"transformer","Gaming"),
                new MovieInfo(2,"harryporter","Fiction"));

        return movieInfos.stream().filter(t-> t.getMovieName().equals(movieName.toLowerCase())).findFirst().orElse(new MovieInfo(9999,"Movie Not Found","UnKnown"));

    }

}
