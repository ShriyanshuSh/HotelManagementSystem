package com.hotelmanage.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotelmanage.entity.Booking;
import com.hotelmanage.repository.BookingRepo;
import com.hotelmanage.service.BookingServ;

@Service
public class BookingServImpl implements BookingServ {

    @Autowired
    private BookingRepo bookingRepo;

    public Booking saveBooking(Booking booking) {
        return bookingRepo.save(booking);
    }

    public List<Booking> getAllBookings() {
        return bookingRepo.findAll();
    }

    public Booking getBookingById(Long id) {
        return bookingRepo.findById(id).orElse(null);
    }

    public Booking updateBooking(Long id, Booking booking) {
        booking.setBookingId(id);
        return bookingRepo.save(booking);
    }

    public void deleteBooking(Long id) {
        bookingRepo.deleteById(id);
    }
}