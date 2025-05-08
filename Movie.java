import java.util.ArrayList;
import java.util.Scanner;

class Movie {
    private String title;
    private int totalSeats;
    private ArrayList<String> bookedCustomers;

    public Movie(String title, int totalSeats) {
        this.title = title;
        this.totalSeats = totalSeats;
        this.bookedCustomers = new ArrayList<>();
    }
//hi
    public boolean bookTicket(String name) {
        if (bookedCustomers.size() < totalSeats) {
            bookedCustomers.add(name);
            return true;
        } else {
            return false; // No available seats
        }
    }

    public boolean cancelTicket(String name) {
        return bookedCustomers.remove(name); // Returns true if the name exists and is removed
    }

    public void showDetails() {
        System.out.println("Movie: " + title);
        System.out.println("Total Seats: " + totalSeats);
        System.out.println("Available Seats: " + (totalSeats - bookedCustomers.size()));
        System.out.println("Booked Customers: " + bookedCustomers);
    }

    public String getTitle() {
        return title;
    }
}
