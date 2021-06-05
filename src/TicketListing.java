import java.util.ArrayList;
import java.util.List;

/**
 * The type Ticket listing.
 */
public class TicketListing implements Listing{

    /**
     * The Ticket list.
     */
    List<Ticket> ticketList;

    /**
     * Instantiates a new Ticket listing.
     *
     * @param ticketList the ticket list
     */
    public TicketListing(List<Ticket> ticketList) {
        this.ticketList = ticketList;
    }

    /**
     * Instantiates a new Ticket listing.
     */
    public TicketListing() {
        createListing();
    }

    @Override
    public void ListingMessage() {
        System.out.println("Here is a list of destinations:");
        System.out.printf("%40s %1s %15s %1s %30s %1s %10s %1s%n", "PLACE", "|", "TRIP DURATION", "|",
                "PRICE", "|", "TICKETS AVAILABLE", "|");
        System.out.printf("%s%n", "-------------------------------------------------------------------" +
                "--------------------------------------------------------------------------------------" +
                "--------------------------------------------------");

        for (int i = 0; i < ticketList.size(); i++) {
            System.out.printf("%40s %1s %15s %1s %30s %1s %10s %1s%n", "[" + (i+1) + "]" + ticketList.get(i).getPlace(), "|",
                    ticketList.get(i).getPrice(), "|", ticketList.get(i).getPlace(), "|", ticketList.get(i).getTickets(), "|");
        }
        System.out.printf("%s%n", "-------------------------------------------------------------------" +
                "----------------------------------------------------------------------------------------" +
                "------------------------------------------------");
        System.out.println("\nWhich destination do you want to choose?");
    }

    @Override
    public void createListing() {
        ticketList = new ArrayList<>();

        Ticket ticket1 = new Ticket("Maisson Eatery Buffet", "3HRS",95,20);
        Ticket ticket2 = new Ticket("Edison Beachfront Cafe", "3HRS",145,15);
        Ticket ticket3 = new Ticket("Etienne Hotel and Residences", "3D2N",295,10);

        ticketList.add(ticket1);
        ticketList.add(ticket2);
        ticketList.add(ticket3);
    }

    @Override
    public ListingObject getObject(int i) {
        return ticketList.get(i);
    }
}
