package io.javabrains.ratingsdataservice.entity;

import java.util.List;

public class RatingWrapper {
    private List<Rating> ratingList;

    public List<Rating> getRatingList() {
        return ratingList;
    }

    public void setRatingList(List<Rating> ratingList) {
        this.ratingList = ratingList;
    }
}
