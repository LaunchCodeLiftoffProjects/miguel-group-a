package org.launchcode.Secretrestaurantreview.Controllers;

import org.launchcode.Secretrestaurantreview.Data.ReviewRepository;
import org.launchcode.Secretrestaurantreview.Models.Review;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
@RequestMapping("review")
public class ReviewController {

    @Autowired
    private ReviewRepository reviewRepository;


    @GetMapping
    public String displayAllReviews(@RequestParam(required = false) Integer reviewId, Model model){
        if (reviewId == null) {
            model.addAttribute("title", "All Reviews");
            model.addAttribute("reviews", reviewRepository.findAll());
        } else if (reviewId != null){
            Optional<Review> result = reviewRepository.findById(reviewId);
            if (result.isEmpty()) {
                model.addAttribute("title", "Invalid Review ID: ");
            } else {
                Review review = result.get();
                model.addAttribute("title", "Reviews for: " + review.getRestaurantName());
                model.addAttribute("reviews", review.getId());
                //should I include IDs for the restaurants as well?//
            }
        }
    }
}

