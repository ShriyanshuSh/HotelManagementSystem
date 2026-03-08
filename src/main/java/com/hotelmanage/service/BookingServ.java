package com.hotelmanage.service;

import java.util.List;
import com.hotelmanage.entity.Booking;

public interface BookingServ {

    Booking saveBooking(Booking booking);

    List<Booking> getAllBookings();

    Booking getBookingById(Long id);

    Booking updateBooking(Long id, Booking booking);

    void deleteBooking(Long id);
}