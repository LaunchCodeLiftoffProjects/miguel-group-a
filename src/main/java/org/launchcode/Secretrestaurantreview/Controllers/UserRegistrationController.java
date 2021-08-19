package org.launchcode.Secretrestaurantreview.Controllers;

import org.launchcode.Secretrestaurantreview.Controllers.Dto.UserRegistrationDTO;
import org.launchcode.Secretrestaurantreview.Service.UserServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/registration")
public class UserRegistrationController {

    private UserServiceImpl userService;

    public UserRegistrationController(UserServiceImpl userService) {
        super();
        this.userService = userService;
    }

    public String registrationUserAccount(@ModelAttribute("user")UserRegistrationDTO registrationDTO) {

        userService.save(registrationDTO);
        return "redirect:/registration?success";

    }

}
