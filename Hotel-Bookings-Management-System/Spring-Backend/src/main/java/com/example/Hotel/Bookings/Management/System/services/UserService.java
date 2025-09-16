package com.example.Hotel.Bookings.Management.System.services;

import com.example.Hotel.Bookings.Management.System.dto.LoginRequest;
import com.example.Hotel.Bookings.Management.System.dto.RegistrationRequest;
import com.example.Hotel.Bookings.Management.System.dto.Response;
import com.example.Hotel.Bookings.Management.System.dto.UserDTO;
import com.example.Hotel.Bookings.Management.System.entities.User;

public interface UserService {

    Response registerUser(RegistrationRequest registrationRequest);
    Response loginUser(LoginRequest loginRequest);
    Response getAllUsers();
    Response getOwnAccountDetails();
    User getCurrentLoggedInUser();
    Response updateOwnAccount(UserDTO userDTO);
    Response deleteOwnAccount();
    Response getMyBookingHistory();
}
