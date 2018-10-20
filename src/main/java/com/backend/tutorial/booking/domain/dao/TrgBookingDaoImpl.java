package com.backend.tutorial.booking.domain.dao;


import com.backend.tutorial.booking.domain.modal.TrgBooking;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class TrgBookingDaoImpl implements TrgBookingDao {

    @PersistenceContext
    private EntityManager em;

    /**
     * Insert
     * read
     */


    @Override
    public void saveBooking(TrgBooking booking) {
        em.persist(booking);   //insert into
        em.flush();
    }

    @Override
    public List<TrgBooking> findBookings(){
        Query q = em.createQuery("select Goat from Booking Goat");
        return q.getResultList();
    }
}
