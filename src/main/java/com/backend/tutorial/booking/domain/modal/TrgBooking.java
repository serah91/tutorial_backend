package com.backend.tutorial.booking.domain.modal;

import java.sql.Date;

public interface TrgBooking {
    Long getId();

    void setId(Long id);

    String getBookingDate();

    void setBookingDate(String bookingDate);

    String getBookingTime();

    void setBookingTime(String bookingTime);

    int getNoOfPeople();

    void setNoOfPeople(int noOfPeople);

    Date getBookingFrom();

    void setBookingFrom(Date bookingFrom);

    Date getBookingTo();

    void setBookingTo(Date bookingTo);

    String getRoomNo();

    void setRoomNo(String roomNo);
}
