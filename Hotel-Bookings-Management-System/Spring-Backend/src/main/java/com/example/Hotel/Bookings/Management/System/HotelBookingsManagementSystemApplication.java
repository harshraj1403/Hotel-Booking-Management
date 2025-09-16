package com.example.Hotel.Bookings.Management.System;

import com.example.Hotel.Bookings.Management.System.dto.NotificationDTO;
import com.example.Hotel.Bookings.Management.System.repositories.NotificationRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
//@RequiredArgsConstructor
public class HotelBookingsManagementSystemApplication {

//    private final NotificationService notificationService;

	public static void main(String[] args) {
		SpringApplication.run(HotelBookingsManagementSystemApplication.class, args);
	}

//    @PostConstruct
//    public void sendDummyEmail(){
//        NotificationDTO notificationDTO = NotificationDTO.builder()
//                .recipient("chkrishna193@gmail.com")
//                .body("Hello World!")
//                .subject("Hello World!")
//                .build();
//        notificationService.sendEmail(notificationDTO);
//    }
}
