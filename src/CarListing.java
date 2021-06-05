import java.util.ArrayList;
import java.util.List;

/**
 * The type Car listing.
 */
public class CarListing  implements Listing{

    /**
     * Instantiates a new Car listing.
     *
     * @param carList the car list
     */
    public CarListing(List<Car> carList) {
        this.carList = carList;
    }

    /**
     * Instantiates a new Car listing.
     */
    public CarListing() {
        createListing();
    }

    private List<Car> carList;

    @Override
    public void ListingMessage() {
        System.out.println("\nHere is a list of cars:");
        System.out.printf("%20s %1s %10s %1s%n", "TYPE", "|", "PRICE", "|");
        System.out.printf("%s%n", "============================================================================");
        for (int i = 0; i < carList.size(); i++) {
            System.out.printf("%20s %1s %10s %1s%n", "[" + (i + 1) + "]" + carList.get(i).getCarType(), "|", carList.get(i).getPrice(), "|");
        }
        System.out.println("============================================================================");
        System.out.println("\nWhich car do you want to choose?");
    }

    @Override
    public void createListing() {
        carList = new ArrayList<>();

        Car car1 = new Car();
        car1.setCarType("4-Seater Car");
        car1.setPrice(50);

        Car car2 = new Car();
        car2.setCarType("6 Seater Van");
        car2.setPrice(100);

        Car car3 = new Car();
        car3.setCarType("Motorbike");
        car3.setPrice(30);

        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
    }

    @Override
    public ListingObject getObject(int i) {
        return carList.get(i);
    }
}

