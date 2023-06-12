package com.sivaram.spring.catalog.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class MovieInfo {

    int movieId;
    String movieName;
    String movieDescription;
}
