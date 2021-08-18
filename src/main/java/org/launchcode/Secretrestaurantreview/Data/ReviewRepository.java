package org.launchcode.Secretrestaurantreview.Data;

import org.launchcode.Secretrestaurantreview.Models.Review;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepository extends CrudRepository<Review, Integer> {
}
