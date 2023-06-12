package com.sivaram.rating.resource;

import com.sivaram.rating.model.Rating;
import com.sivaram.rating.model.UserRating;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/rating")
public class RatingService {

    @RequestMapping("/{movieId}")
    public UserRating getRating(){

        List<Rating> ratings =  Arrays.asList(new Rating("transformer",4f),new Rating("harryporter",5));
        UserRating userRating = UserRating.builder()
                .userRatings(ratings)
                .build();
        return userRating;
    }
}
