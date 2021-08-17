package org.launchcode.Secretrestaurantreview.Controllers;

import org.launchcode.Secretrestaurantreview.Data.ReviewRepository;
import org.launchcode.Secretrestaurantreview.Models.Review;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
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

            }
        }
        return "review/index";
    }

    //lives at /review/create
    @GetMapping("create")
    public String renderCreateReviewForm(Model model){
        model.addAttribute("title", "Create Review");
        model.addAttribute(new Review());

        return "review/create";
    }

    @PostMapping("create")
    public String processCreateReviewForm(@ModelAttribute @Valid Review newReview,
                                         Errors errors, Model model){
        if (errors.hasErrors()){
            model.addAttribute("title", "Create Review");
            return "review/create";
        }

        reviewRepository.save(newReview);
        return "redirect:";
    }
}

