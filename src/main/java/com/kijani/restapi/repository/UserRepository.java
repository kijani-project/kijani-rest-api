package com.kijani.restapi.repository;

import com.kijani.restapi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * @author roed
 */
public interface UserRepository extends JpaRepository<User, Integer> {

  Optional<User> findUserByName(String name);
}
