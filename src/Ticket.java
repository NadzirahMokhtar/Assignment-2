/**
 * The type Ticket.
 */
public class Ticket extends ListingObject{

    /**
     * Instantiates a new Ticket.
     *
     * @param place   the place
     * @param hrs     the hrs
     * @param price   the price
     * @param tickets the tickets
     */
    public Ticket(String place, String hrs, int price, int tickets) {
        this.place = place;
        this.hrs = hrs;
        super.setPrice(price);
        this.tickets = tickets;
    }

    private String place;

    private String hrs;

    private int tickets;

    /**
     * Gets place.
     *
     * @return the place
     */
    public String getPlace() {
        return place;
    }

    /**
     * Sets place.
     *
     * @param place the place
     */
    public void setPlace(String place) {
        this.place = place;
    }

    /**
     * Gets hrs.
     *
     * @return the hrs
     */
    public String getHrs() {
        return hrs;
    }

    /**
     * Sets hrs.
     *
     * @param hrs the hrs
     */
    public void setHrs(String hrs) {
        this.hrs = hrs;
    }

    /**
     * Gets tickets.
     *
     * @return the tickets
     */
    public int getTickets() {
        return tickets;
    }

    /**
     * Sets tickets.
     *
     * @param tickets the tickets
     */
    public void setTickets(int tickets) {
        this.tickets = tickets;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "place='" + place + '\'' +
                ", hrs='" + hrs + '\'' +
                ", price=" + super.getPrice() +
                ", tickets=" + tickets +
                '}';
    }
}
