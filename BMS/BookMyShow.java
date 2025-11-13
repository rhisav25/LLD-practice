package BMS;

import java.util.ArrayList;
import java.util.List;

public class BookMyShow {
    List<Show> shows = new ArrayList<>();
    void add(Show show){
        shows.add(show);
    }

    List<Show> search(String movieName){
        List <Show> res = new ArrayList<>();
        for(Show s:shows){
            if(s.movie.title.equalsIgnoreCase(movieName)){
                res.add(s);
            }
        }
        return res;
    }

    Booking book(User user, Show show, List<Integer> seats){
        if(show.bookSeats(seats)){
            System.out.println("Ticket booked for the user "+ user.name);
            return new Booking(show, seats);
        }
        System.out.println("Failed to book for the user "+ user.name);
        return null;

    }
}
