import java.util.ArrayList;
import java.util.List;

public class Q3 {
    public static void main(String[] args) {
        Car tesla_model_s = new Car("Tesla", "Tesla Model S", 2022);
        Car rav4 = new Car("Toyota", "RAV4", 2021);
        Car telluride = new Car("KIA", "Telluride", 2020);
        Car civic = new Car("Honda", "Civic", 2019);
        Car land_rover = new Car("Land Rover", "Range Rover Sport 5.0", 2017);

        List<Car> cars = new ArrayList<Car>();
        cars.add(tesla_model_s);
        cars.add(civic);
        cars.add(telluride);
        cars.add(land_rover);
        cars.add(rav4);

        System.out.println("Not Sorted Cars");
        for (Car car: cars) {
            System.out.println(car.getModel());
        }

        cars.sort((car1, car2)
        -> car1.getYear().compareTo(car2.getYear()));

        System.out.println("Sorted Cars");
        for (Car car: cars) {
            System.out.println(car.getModel());
        }
    }
}

class Car {
    private String make;
    private String model;
    private Integer year;

    Car(String make, String model, int year) {
       this.make = make;
       this.model = model;
       this.year = year;
    }

    public String getMake() { return this.make; }
    public String getModel() { return this.model; }
    public Integer getYear() { return this.year; }

}

class CustomComparator {
    public int compare(Car car1, Car car2) {
        return Integer.compare(car1.getYear(), car2.getYear());
    }
}
