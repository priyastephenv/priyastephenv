package com.techelevator.reservations.dao;

import java.util.List;

import com.techelevator.reservations.model.Reservation;

public interface ReservationDao {

    List<Reservation> getReservations();

    List<Reservation> getReservationsByHotel(int hotelId);

    Reservation getReservationById(int reservationId);

    Reservation createReservation(Reservation reservation);

    Reservation updateReservation(Reservation reservation, int reservationId);

    int deleteReservationById(int id);

}
