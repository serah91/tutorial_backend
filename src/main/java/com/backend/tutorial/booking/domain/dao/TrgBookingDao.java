package com.backend.tutorial.booking.domain.dao;

import com.backend.tutorial.booking.domain.modal.TrgBooking;

import java.util.List;

public interface TrgBookingDao {


    void saveBooking(TrgBooking booking);

    List<TrgBooking> findBookings();
}
