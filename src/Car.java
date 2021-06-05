/**
 * The type Car.
 */
public class Car extends ListingObject {

    private String carType;

    /**
     * Gets car type.
     *
     * @return the car type
     */
    public String getCarType() {
        return carType;
    }

    /**
     * Sets car type.
     *
     * @param carType the car type
     */
    public void setCarType(String carType) {
        this.carType = carType;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carType='" + carType + '\'' +
                ", price=" + super.getPrice() +
                '}';
    }
}