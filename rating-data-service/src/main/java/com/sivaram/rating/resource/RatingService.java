package com.sivaram.rating.resource;

import com.sivaram.rating.model.Rating;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/rating")
public class RatingService {

    @RequestMapping("/{movieId}")
    public List<Rating> getRating(){

        return  Arrays.asList(new Rating(1,4f),new Rating(2,5));
    }
}
