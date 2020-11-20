import java.util.*;

public class Car {

    // Attributes{color,
    // fuelCapacity,electric,automatic,voicecommand,AC,numberOfDoor}
    private String CarName;
    private String Color;
    private int fuelCapacity;
    private boolean isElectric;
    private boolean isAutomatic;
    private boolean hasVoiceCommand;
    private int numberOfDoors;
    private boolean hasAC;
    private Door leftDoor;
    private Door rightDoor;

    public static int NUMBER_OF_CARS = 0;

    // Constructor --> SAME AS THE CLAS NAME WITH NO RETURN TYPE
    // DEFAULT CONST.
    public Car() {
        NUMBER_OF_CARS++;
    }

    // Const. with parameters //eg Car mycar = new Car("Red",50,2);
    public Car(String name, String color, int capacity, int doors) {
        this.CarName = name;
        this.Color = color;
        this.fuelCapacity = capacity;
        this.numberOfDoors = doors;
        NUMBER_OF_CARS++;
    }

    // eg Car mycar = new Car("Red",50,2,true);
    public Car(String name, String color, int capacity, int doors, boolean electic) {
        this.CarName = name;
        this.Color = color;
        this.fuelCapacity = capacity;
        this.numberOfDoors = doors;
        this.isElectric = electic;
        NUMBER_OF_CARS++;
    }

    public Car(String name, String color, int capacity, boolean electic, boolean automatic, boolean voiceCommand,
            int doors, boolean hasAC) {
        this.CarName = name;
        this.Color = color;
        this.fuelCapacity = capacity;
        this.numberOfDoors = doors;
        this.isElectric = electic;
        this.isAutomatic = automatic;
        this.hasVoiceCommand = voiceCommand;
        this.hasAC = hasAC;
        NUMBER_OF_CARS++;
    }

    // Getters and Setters -- every setter returns void, and every getter reuturn
    // the data type of the attribute it is getting

    public void setCarName(String _name) {
        this.Color = _name;
    }

    public String getCarName() {
        return this.CarName;
    }

    public void setColor(String _color) {
        this.Color = _color;
    }

    public String getColor() {
        return this.Color;
    }

    public void setFuelCapacity(int _capacity) {
        this.fuelCapacity = _capacity;
    }

    public int getFuelCapacity() {
        return this.fuelCapacity;
    }

    public void setisAutomatic(boolean _automatic) {
        this.isAutomatic = _automatic;
    }

    public boolean getisAutomatic() {
        return this.isAutomatic;
    }

    // Functions

    // 1. Return all manual cars
    public static List<Car> getAllManualCar(Car[] inputCars) {

        List<Car> manualCars = new ArrayList<>();

        for (int i = 0; i < inputCars.length; i++) {

            if (!inputCars[i].isAutomatic) {
                manualCars.add(inputCars[i]);
            }
        }
        return manualCars;
    }

    public void driveCar() {
        System.out.println(this.CarName + " has started driving");
    }

}