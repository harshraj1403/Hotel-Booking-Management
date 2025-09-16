package com.example.Hotel.Bookings.Management.System.repositories;

import com.example.Hotel.Bookings.Management.System.entities.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepository extends JpaRepository<Notification, Long> {
}
