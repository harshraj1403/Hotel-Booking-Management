package com.example.Hotel.Bookings.Management.System.repositories;

import com.example.Hotel.Bookings.Management.System.entities.BookingReference;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BookingReferenceRepository extends JpaRepository<BookingReference, Long> {

    Optional<BookingReference> findByReferenceNo(String referenceNo);
}
