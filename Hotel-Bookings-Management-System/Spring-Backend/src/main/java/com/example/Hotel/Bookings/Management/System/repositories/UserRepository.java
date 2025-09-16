package com.example.Hotel.Bookings.Management.System.repositories;

import com.example.Hotel.Bookings.Management.System.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);
}
