package org.launchcode.Secretrestaurantreview.Service;

import org.launchcode.Secretrestaurantreview.Controllers.Dto.UserRegistrationDTO;
import org.launchcode.Secretrestaurantreview.Data.UserRepository;
import org.launchcode.Secretrestaurantreview.Models.Role;
import org.launchcode.Secretrestaurantreview.Models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User save(UserRegistrationDTO registrationDTO) {
        User user = new User(registrationDTO.getFirstName(),
                registrationDTO.getLastName(), registrationDTO.getEmail(),
                registrationDTO.getPassword(),
                Arrays.asList(new Role("ROLE_USER")));
        return userRepository.save(user);
    }
}
