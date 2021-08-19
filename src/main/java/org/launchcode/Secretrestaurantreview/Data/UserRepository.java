package org.launchcode.Secretrestaurantreview.Data;

import org.launchcode.Secretrestaurantreview.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
