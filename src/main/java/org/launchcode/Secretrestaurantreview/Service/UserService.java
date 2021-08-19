package org.launchcode.Secretrestaurantreview.Service;

import org.launchcode.Secretrestaurantreview.Controllers.Dto.UserRegistrationDTO;
import org.launchcode.Secretrestaurantreview.Models.User;

public interface UserService {

    User save(UserRegistrationDTO registrationDTO);

}
