package com.example.Hotel.Bookings.Management.System.services;

import com.example.Hotel.Bookings.Management.System.dto.NotificationDTO;

public interface NotificationService {

    void sendEmail(NotificationDTO notificationDTO);

    void sendSms();

    void sendWhatsApp();
}
