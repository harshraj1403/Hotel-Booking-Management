package com.example.Hotel.Bookings.Management.System.repositories;

import com.example.Hotel.Bookings.Management.System.entities.PaymentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<PaymentEntity, Long> {
}
