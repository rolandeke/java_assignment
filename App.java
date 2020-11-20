import java.util.*;

public class App {

    public static void main(String[] args) throws InterruptedException {

        Human tongolo = new Human("Jospeh", 23, "01/06/1997");
        Human abu = new Human("Abu", 23, "01/06/1997");
        Human mary = new Human("Mary", 53, "01/06/1997");
        Human jane = new Human("Jane", 19, "01/06/1997");

        tongolo.eat("Foo Foo");
        Thread.sleep(3000);

        mary.sing("Me Koko Roas");
        Thread.sleep(4000);

        Human[] humans = { tongolo, abu, mary, jane };

        for (int i = 0; i < humans.length; i++) {
            System.out.println(humans[i].getName());
        }

        // data type, variable name
        // Car firstCar = new Car("White", 60, 4, true);
        // Car firstCar = new Car();
        // firstCar.setCarName("VolxWagon");
        // firstCar.setColor("White");
        // firstCar.setFuelCapacity(80);
        // firstCar.setisAutomatic(true);

        // Car secondCar = new Car("Second Car", "Black", 60, false, false, true, 2,
        // true);
        // Car thirdCar = new Car("Third Car", "Red", 50, true, true, true, 4, true);
        // Car fourthCar = new Car("Fourth Car", "Pink", 100, true, false, true, 4,
        // true);
        // Car fifthCar = new Car("Fifth Car", "Green", 40, false, false, true, 2,
        // true);

        // fourthCar.setColor("Dark Pink");
        // Car[] carArray = { firstCar, secondCar, thirdCar, fourthCar, fifthCar };

        // secondCar.driveCar();

        // Thread.sleep(3000);

        // thirdCar.driveCar();

        // List<Car> ourManualCars = Car.getAllManualCar(carArray);

        // for (int j = 0; j < ourManualCars.size(); j++) {
        // System.out.println(ourManualCars.get(j).getCarName());
        // System.out.println(ourManualCars.get(j).getColor());
        // System.out.println(ourManualCars.get(j).getFuelCapacity());
        // System.out.println(ourManualCars.get(j).getisAutomatic());
        // System.out.println("\n");
        // }

        // System.out.println(Car.NUMBER_OF_CARS);

        // To assign to the object we use the dot(.) operator
        // firstCar.setColor("White");
        // firstCar.setFuelCapacity(79);

        // int _capacity = firstCar.getFuelCapacity();
        // String _color = firstCar.getColor();

        // System.out.println("Color of the car is: " + _color);
        // System.out.println("Fuel capacity of the car is: " + _capacity);

    }
}
