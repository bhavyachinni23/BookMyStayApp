import java.util.LinkedList;
import java.util.Queue;

class Reservation {

    String guestName;
    String roomType;

    public Reservation(String guestName, String roomType) {

        this.guestName = guestName;
        this.roomType = roomType;
    }
}

class BookingQueue {

    Queue<Reservation> queue = new LinkedList<>();

    public void addReservation(Reservation r) {

        queue.add(r);
        System.out.println("Booking request added for " + r.guestName);
    }

    public void showQueue() {

        for(Reservation r : queue) {

            System.out.println(r.guestName + " requested " + r.roomType);
        }
    }
}

public class UseCase5BookingRequestQueue {

    public static void main(String[] args) {

        BookingQueue queue = new BookingQueue();

        queue.addReservation(new Reservation("Alice", "Single"));
        queue.addReservation(new Reservation("Bob", "Suite"));

        System.out.println("\nCurrent Booking Queue:");

        queue.showQueue();
    }
}