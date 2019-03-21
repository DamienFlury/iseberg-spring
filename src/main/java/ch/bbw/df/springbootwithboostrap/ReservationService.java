package ch.bbw.df.springbootwithboostrap;

import java.util.List;

public class ReservationService {
    public ReservationService(List<Reservation> reservations){
        this.reservations = reservations;
    }

    /**
     * @return the reservations
     */
    public List<Reservation> getReservations() {
        return reservations;
    }

    private final List<Reservation> reservations;

    
}