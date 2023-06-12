package com.sivaram.spring.catalog.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class CatalogItem {

    int movieId;
    String movieName;
    String movieDescription;
    float rating;


}
