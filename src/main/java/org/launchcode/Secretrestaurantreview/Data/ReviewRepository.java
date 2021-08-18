package org.launchcode.Secretrestaurantreview.data;

import org.launchcode.Secretrestaurantreview.models.Review;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepository extends CrudRepository<Review, Integer> {
}
