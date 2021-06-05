import java.util.Scanner;

/**
 * The type Main.
 */
public class Main {
    /**
     * The Sc.
     */
    static Scanner sc = new Scanner(System.in);

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {

        welcomeMessage();
        int option;
        while (true) {

            // try -catch to make sure user input correct input type
            try {
                option = sc.nextInt();

                // input 99 quit program
                if (option == 99) {
                    break;
                }
                switch (option) {
                    case 0:
                        menu1();
                        break;
                    case 1:
                        menu2();
                        break;
                    default:
                        break;
                }


            } catch (Exception ex) {
                ex.printStackTrace();
            }
            welcomeMessage();
        }
        System.out.println("Thank you, program end here :)");
        sc.close();

    }

    /**
     * Welcome message.
     */
    public static void welcomeMessage() {
        System.out.println("===================================");
        System.out.println("Welcome to Destination Service!");
        System.out.println("===================================\n");

        System.out.println("To start, choose a user type.");
        System.out.println("[0] Customer\n[1] Employee\n[99] Quit");
    }

    /**
     * Menu 1.
     */
    public static void menu1() {
        System.out.println("\nHello Customer! Please input your name.");
        String name = sc.next();
        Customer customer = new Customer(name);
        TicketListing ticketListing = new TicketListing();
        ticketListing.ListingMessage();
        int destChoice = sc.nextInt();
        Ticket ticket = (Ticket) ticketListing.getObject(destChoice);
        System.out.println("\nWhen do you want to go?");
        String date = sc.next();
        CarListing carListing = new CarListing();
        carListing.ListingMessage();
        int carChoice = sc.nextInt();
        Car car = (Car) carListing.getObject(carChoice);
        String carType = car.getCarType();
        int carP = car.getPrice();
        String dest = ticket.getPlace();
        int destP = ticket.getPrice();
        ManageService customerManageService = new CustomerManageService(customer.getName(), dest, destP, date, carType, carP);
        customerManageService.printMessage();
    }

    /**
     * Menu 2.
     */
    public static void menu2() {
        System.out.println("\nHello Admin. What would you like to do?");
        System.out.println("[0] Manage Employee\n[1] Manage Finances");
        int choice = sc.nextInt();
        ManageService ms;
        if (choice == 0) {
            ms = new EmployeeManageService();
        } else if (choice == 1) {
            System.out.println("Enter total sales: ");
            double sales = sc.nextDouble();
            ms = new FinancesManageService(sales);
        } else {
            System.out.println("Invalid choice.");
            return;
        }
        ms.printMessage();
    }
}

