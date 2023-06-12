package com.sivaram.rating.model;

import lombok.Builder;

import java.util.List;

@Builder
public class UserRating {

    List<Rating> userRatings;

}
