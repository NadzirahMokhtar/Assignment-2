/**
 * The type Customer manage service.
 */
public class CustomerManageService implements ManageService {

    private String name;
    private String dest;
    private double destP;
    private String date;
    private String carType;
    private double carP;

    /**
     * Instantiates a new Customer manage service.
     *
     * @param name    the name
     * @param dest    the dest
     * @param destP   the dest p
     * @param date    the date
     * @param carType the car type
     * @param carP    the car p
     */
    public CustomerManageService(String name, String dest, double destP, String date, String carType, double carP) {
        this.name = name;
        this.dest = dest;
        this.destP = destP;
        this.date = date;
        this.carType = carType;
        this.carP = carP;
    }

    @Override
    public double calculateFee() {
        return destP + carP;
    }

    @Override
    public void printMessage() {
        int rand = (int) (Math.random() * 100);
        System.out.println("\nReceipt #" + rand);
        System.out.println("=======================");
        System.out.println("Name: " + name);
        System.out.println("Destination: " + dest);
        System.out.println("Price:" + "RM" + destP);
        System.out.println("Date: " + date);
        System.out.println("Car Type: " + carType);
        System.out.println("Price:" + " RM" + carP);
        System.out.println("\nYour Total is: RM" + calculateFee());
        System.out.println("Thank you!");
    }
}

