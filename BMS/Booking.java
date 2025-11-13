package BMS;

import java.util.List;

public class Booking {
    Show show;
    List <Integer> seats;

    Booking(Show show, List <Integer> seats){
        this.show = show;
        this.seats = seats;
    }
}

/*
* Stores confirmation details → which show + which seats
* Doesn’t contain booking logic — that happens in Show
*/
