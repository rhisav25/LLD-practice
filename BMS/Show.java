package BMS;

import java.util.ArrayList;
import java.util.List;

public class Show {
    Movie movie;
    List <Seat> seats;
    
    Show(Movie movie, int totalSeats){
        this.movie = movie;
        seats = new ArrayList<>(); // need declearation here as every time new declearation is there new array for each show
        for(int i=1;i<=totalSeats;i++){
            seats.add(new Seat(i)); // need to add seat object here
        }
    }

    List <Seat> getAvailableSeats(){
        List <Seat> available = new ArrayList<>();
        for(Seat s: seats){
            if(!s.booked){
                available.add(s);
            }
        }
        return available;
    }

    Boolean bookSeats(List<Integer> SeatIds){
        for(int id : SeatIds){
            Seat seat = seats.get(id - 1);
            if(seat.booked )return false;
        }

        for(int id:SeatIds){
            seats.get(id -1).booked = true;
        }
        return true;
    }
}
