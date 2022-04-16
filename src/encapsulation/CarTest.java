package encapsulation;

public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car();

        // Setting info for make
        car1.make = "BMW"; // if no value it will be null

        // Getting info of make
        System.out.println(car1.make); //BMW

        // Setting info for year
        car1.setYear(2020); // if no value will execute 0. If it is void in the Class it can be called with object name

        // Getting info of year
        System.out.println(car1.getYear());

        car1.setPrice(225.000, "abcd1234");

        // Getting info for price
        System.out.println(car1.getPrice());

        System.out.println(car1.getConvertible()); // true
    }
}
