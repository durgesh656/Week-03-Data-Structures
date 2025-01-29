package circularlinkedlist.onlineticketreservationsystem;

import java.time.LocalDateTime;

public class Node {
    int ticketID;
    String customerName;
    String movieName;
    String seatNumber;
    LocalDateTime bookingTime;
    Node next;

    public Node(int ticketID, String customerName, String movieName, String seatNumber, LocalDateTime bookingTime) {
        this.ticketID = ticketID;
        this.customerName = customerName;
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.bookingTime = bookingTime;
        this.next = null;
    }
}


