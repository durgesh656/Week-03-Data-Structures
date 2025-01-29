package circularlinkedlist.onlineticketreservationsystem;


public class Main {
    public static void main(String[] args) {
        LinkedList system = new LinkedList();

        // Adding tickets
        system.addTicket(1, "customer1", "movie1", "A1");
        system.addTicket(2, "customer2", "movie2", "B2");
        system.addTicket(3, "customer3", "movie3", "A2");

        // Displaying tickets
        system.displayTickets();

        // Searching for a ticket
        System.out.println("\nSearching for tickets for 'movie1':");
        system.searchTicket("movie1");

        // Removing a ticket
        System.out.println("\nRemoving ticket with ID 2:");
        system.removeTicket(2);

        // Displaying tickets after removal
        system.displayTickets();

        // Total tickets count
        System.out.println("\nTotal number of tickets: " + system.getTotalTickets());
    }
}
