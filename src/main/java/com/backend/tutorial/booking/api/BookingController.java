package com.backend.tutorial.booking.api;

import com.backend.tutorial.booking.domain.dao.TrgBookingDao;
import com.backend.tutorial.booking.domain.modal.TrgBooking;
import com.backend.tutorial.booking.domain.modal.TrgBookingImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(path = "/api/booking")
public class BookingController {

//    @GetMapping(path = "/hello")
//    public ResponseEntity<String>helloRest(){
//        return new ResponseEntity<>("HELLO WORld", HttpStatus.OK);
//    }

    private final TrgBookingDao bookingDao;

    @Autowired
    public BookingController(TrgBookingDao bookingDao){
        this.bookingDao = bookingDao;
    }

    @PostMapping(path = "/new")
    public ResponseEntity<String>makeBooking(@RequestBody BookingVo vo){
        TrgBooking booking = new TrgBookingImpl();
        booking.setRoomNo(vo.getRoomNo());
        booking.setNoOfPeople(vo.getNoOfPeople());
        booking.setBookingTime(vo.getBookingTime());
        booking.setBookingFrom(vo.getBookingFrom());
        booking.setBookingTo(vo.getBookingTo());

        bookingDao.saveBooking(booking);
        return new ResponseEntity<>("Booking Added",HttpStatus.OK);
    }

    @GetMapping(path="/all")
    public ResponseEntity<List<TrgBooking>> findBookings()
    {
        List<TrgBooking>bookings= bookingDao.findBookings();
        return new ResponseEntity<>(bookings,HttpStatus.OK);
    }
}
