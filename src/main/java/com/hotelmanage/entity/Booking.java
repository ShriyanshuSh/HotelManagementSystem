package com.hotelmanage.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "BOOKING")
public class Booking {

    @Id
    @Column(name = "BOOKING_ID")
    private Long bookingId;

    @Column(name = "CUSTOMER_NAME")
    private String customerName;

    @Column(name = "CUSTOMER_PHONE")
    private String customerPhone;

    @Column(name = "CHECKIN_DATE")
    private LocalDate checkinDate;

    @Column(name = "CHECKOUT_DATE")
    private LocalDate checkoutDate;

    @ManyToOne
    @JoinColumn(name = "ROOM_ID")
    private Room room;

    public Booking() {}

    public Long getBookingId() { return bookingId; }
    public void setBookingId(Long bookingId) { this.bookingId = bookingId; }

    public String getCustomerName() { return customerName; }
    public void setCustomerName(String customerName) { this.customerName = customerName; }

    public String getCustomerPhone() { return customerPhone; }
    public void setCustomerPhone(String customerPhone) { this.customerPhone = customerPhone; }

    public LocalDate getCheckinDate() { return checkinDate; }
    public void setCheckinDate(LocalDate checkinDate) { this.checkinDate = checkinDate; }

    public LocalDate getCheckoutDate() { return checkoutDate; }
    public void setCheckoutDate(LocalDate checkoutDate) { this.checkoutDate = checkoutDate; }

    public Room getRoom() { return room; }
    public void setRoom(Room room) { this.room = room; }
}