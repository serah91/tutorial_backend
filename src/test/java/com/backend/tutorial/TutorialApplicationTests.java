package com.backend.tutorial;

import com.backend.tutorial.booking.domain.dao.TrgBookingDao;
import com.backend.tutorial.booking.domain.modal.TrgBooking;
import com.backend.tutorial.booking.domain.modal.TrgBookingImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TutorialApplicationTests {

    @Autowired
    private TrgBookingDao bookingDao;

    @Test
    public void saveBooking() {

        TrgBooking booking = new TrgBookingImpl();
        booking.setBookingDate("16-10-2020");
//        booking.setBookingFrom(new Date());
//        booking.setBookingTo(new Date());
        booking.setBookingTime("08:08");
        booking.setNoOfPeople(10);
        booking.setRoomNo("RM1090");


        bookingDao.saveBooking(booking);




    }
}