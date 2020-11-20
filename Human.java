public class Human {
    // list all attributes of a human being
    private String Name;
    private int Age;
    private String DOB;

    // set all necessary constructors
    public Human() {

    }

    public Human(String name, int age, String dob) {
        Name = name;
        Age = age;
        DOB = dob;
    }

    // set getters and setters

    public void setName(String _name) {
        Name = _name;
    }

    public String getName() {
        return Name;
    }
    // create custom function --> speak,walk,eat,sayYour

    public void sayYourName() {
        System.out.println("My name is " + Name);
    }

    public void eat(String food) {
        System.out.println(Name + " is eating a " + food);
    }

    public void sing(String _songName) {
        System.out.println(Name + " is singing " + _songName);
    }
}
