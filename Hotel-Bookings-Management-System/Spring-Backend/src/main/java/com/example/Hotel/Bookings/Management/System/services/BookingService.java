package com.example.Hotel.Bookings.Management.System.services;

import com.example.Hotel.Bookings.Management.System.dto.BookingDTO;
import com.example.Hotel.Bookings.Management.System.dto.Response;

public interface BookingService {

    Response getAllBookings();
    Response createBooking(BookingDTO bookingDTO);
    Response findBookingByReferenceNo(String  bookingReference);
    Response updateBooking(BookingDTO bookingDTO);
}
