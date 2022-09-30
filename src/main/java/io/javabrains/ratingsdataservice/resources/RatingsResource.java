package io.javabrains.ratingsdataservice.resources;

import io.javabrains.ratingsdataservice.entity.Rating;
import io.javabrains.ratingsdataservice.entity.RatingWrapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/ratingsdata")
public class RatingsResource {
    @GetMapping("/{movieId}")
    public Rating getRating(@PathVariable("movieId") String movieId){
        return new Rating(movieId,3);
    }

    @GetMapping("users/{userId}")
    public RatingWrapper getUserRating(@PathVariable String userId){
        List<Rating> ratings= Arrays.asList(
                new Rating("101",4),
                new Rating("102",2)
        );
        RatingWrapper ratingWrapper = new RatingWrapper();
        ratingWrapper.setRatingList(ratings);
        return ratingWrapper;
    }
}
